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
package org.kloeckner.storefront.forms;

/**
 * Form object for updating confirmation emails
 */
public class UpdateConfirmationEmailForm {

    private String emails;

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }
}
