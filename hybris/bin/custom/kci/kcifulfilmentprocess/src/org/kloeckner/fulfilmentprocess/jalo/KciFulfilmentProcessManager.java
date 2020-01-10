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
package org.kloeckner.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.kloeckner.fulfilmentprocess.constants.KciFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class KciFulfilmentProcessManager extends GeneratedKciFulfilmentProcessManager
{
	public static final KciFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (KciFulfilmentProcessManager) em.getExtension(KciFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
