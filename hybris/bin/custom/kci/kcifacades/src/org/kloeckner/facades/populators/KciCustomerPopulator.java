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
package org.kloeckner.facades.populators;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import org.apache.commons.lang.StringUtils;
import org.kloeckner.core.model.KciEmailAddressModel;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class KciCustomerPopulator implements Populator<CustomerModel, CustomerData> {
    @Override
    public void populate(final CustomerModel source, final CustomerData target) {
        target.setEmails(getOrderConfirmationEmails(source));
    }

    protected String getOrderConfirmationEmails(final CustomerModel source) {
        List<KciEmailAddressModel> orderConfirmationEmailAddresses = source.getOrderConfirmationEmailAddresses();
        if (Objects.isNull(orderConfirmationEmailAddresses) || orderConfirmationEmailAddresses.isEmpty()) {
            return StringUtils.EMPTY;
        }

        return orderConfirmationEmailAddresses.stream().map(email -> email.getEmail()).collect(Collectors.joining(","));
    }
}
