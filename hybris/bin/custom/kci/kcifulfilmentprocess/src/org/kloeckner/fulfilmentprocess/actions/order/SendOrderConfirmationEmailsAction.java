/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.kloeckner.fulfilmentprocess.actions.order;


import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.task.RetryLaterException;
import org.springframework.beans.factory.annotation.Required;
import reactor.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SendOrderConfirmationEmailsAction extends AbstractProceduralAction {

    private EmailService emailService;

    @Override
    public void executeAction(final BusinessProcessModel businessProcessModel)
            throws RetryLaterException {
        OrderModel order = ((OrderProcessModel) businessProcessModel).getOrder();
        if (order != null && order.getUser() != null && !order.getUser().getOrderConfirmationEmails().isEmpty()) {
            order.getUser()
                    .getOrderConfirmationEmails()
                    .stream()
                    .forEach(orderConfirmationEmail -> {
                        for (final EmailMessageModel email : businessProcessModel.getEmails()) {
                            String confEmail = orderConfirmationEmail.getEmail();
                            if (!StringUtils.isEmpty(confEmail)) {
                                email.setToAddresses(Arrays.asList(getEmailService().getOrCreateEmailAddressForEmail(confEmail, confEmail)));
                                email.setBody(String.format("User %s created the order %s with %s items.", order.getUser().getName(), order.getCode(), order.getEntries().size()));
                            }
                            getEmailService().send(email);
                        }
                    });
        }
    }

    protected EmailService getEmailService() {
        return emailService;
    }

    @Required
    public void setEmailService(final EmailService emailService) {
        this.emailService = emailService;
    }
}
