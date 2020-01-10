package org.kloeckner.facades.customers.impl;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.core.model.user.UserModel;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.kloeckner.core.model.KciEmailAddressModel;
import org.kloeckner.facades.customers.KciCustomerFacade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KciCustomerFacadeImpl extends DefaultCustomerFacade implements KciCustomerFacade {

    private static final Logger LOG = Logger.getLogger(KciCustomerFacadeImpl.class);

    @Override
    public void updateConfirmationEmails(String confirmationEmails) {
        final UserModel currentUser = getCurrentUser();
        try {
            currentUser.setOrderConfirmationEmailAddresses(getListOfKciEmailAddresses(confirmationEmails));
            getModelService().saveAll();
            getModelService().refresh(currentUser);
        } catch (Exception e) {
            LOG.error("Error while updating the list of emails for customer.", e);
        }
    }

    protected List<KciEmailAddressModel> getListOfKciEmailAddresses(String confirmationEmails) {
        List<KciEmailAddressModel> listOfEmails = new ArrayList<>();

        confirmationEmails.trim().replaceAll(" ", StringUtils.EMPTY);
        List<String> orderEmails = new ArrayList<String>(Arrays.asList(confirmationEmails.split(",")));

        orderEmails.stream().forEach(email -> {
            KciEmailAddressModel kciEmailAddressModel = new KciEmailAddressModel();
            kciEmailAddressModel.setEmail(email);
            listOfEmails.add(kciEmailAddressModel);
        });

        return listOfEmails;
    }
}
