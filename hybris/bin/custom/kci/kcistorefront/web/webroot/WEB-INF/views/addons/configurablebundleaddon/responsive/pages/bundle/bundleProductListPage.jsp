<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>
<%@ taglib prefix="storepickup" tagdir="/WEB-INF/tags/responsive/storepickup" %>

<%--
        ~ /*
        ~  * [y] hybris Platform
        ~  *
        ~  * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
        ~  *
        ~  * This software is the confidential and proprietary information of SAP
        ~  * ("Confidential Information"). You shall not disclose such Confidential
        ~  * Information and shall use it only in accordance with the terms of the
        ~  * license agreement you entered into with SAP.
        ~ */
--%>
<template:page pageTitle="${pageTitle}">

    <div class="row">
        <cms:pageSlot position="Section1" var="feature" element="div" class="product-list-section1-slot">
            <cms:component component="${feature}" element="div" class="col-xs-12 yComponentWrapper product-list-section1-component"/>
        </cms:pageSlot>
    </div>
    <div class="row">
        <div class="col-xs-3">
            <cms:pageSlot position="ProductLeftRefinements" var="feature" element="div" class="product-list-left-refinements-slot">
                <cms:component component="${feature}" element="div" class="yComponentWrapper product-list-left-refinements-component"/>
            </cms:pageSlot>
        </div>
        <div class="col-sm-12 col-md-9">
            <cms:pageSlot position="ProductSelectorSlot" var="feature" element="div" class="product-list-right-slot">
                <cms:component component="${feature}" element="div" class="product__list--wrapper yComponentWrapper product-list-right-component"/>
            </cms:pageSlot>
        </div>
    </div>

</template:page>

<script type="text/javascript">
	$(document).ready(function () {
		$($("#product-facet").children().get(0)).hide()
	});
</script>

