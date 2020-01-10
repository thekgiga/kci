<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<spring:htmlEscape defaultHtmlEscape="true" />

<c:set var="name" value="${fn:split(fn:escapeXml(fragmentData.name), ' ')[0]}" scope="page"/>
<c:set var="technologyUsedDataList" value="${fragmentData.technologyUsedData}" scope="page"/>
<c:set var="loyaltyData" value="${fragmentData.customerLoyaltyData}" scope="page"/>

<c:set var="silverBadgeStatus" value="${loyaltyData.silverBadgeActive ? 'asm__customer360-overview-info-points-medals-silver-on' : 'asm__customer360-overview-info-points-medals-silver-off'}"/>
<c:set var="goldBadgeStatus" value="${loyaltyData.goldBadgeActive ? 'asm__customer360-overview-info-points-medals-gold-on' : 'asm__customer360-overview-info-points-medals-gold-off'}"/>
<c:set var="platinumBadgeStatus" value="${loyaltyData.platinumBadgeActive ? 'asm__customer360-overview-info-points-medals-platinum-on' : 'asm__customer360-overview-info-points-medals-platinum-off'}"/>
<c:set var="currentLoyaltyBalance" value="${fn:escapeXml(loyaltyData.currentLoyaltyBalance)}" scope="page"/>

<div role="tabpanel" class="tab-pane active" id="customerDetailsSection">

<div class="asm__customer360-overview">
    <div class="asm__customer360-overview-info">
       <div class="row">
            <div class="col-sm-4">       			    
               <div class="asm__customer360-overview-info-points">
                	<div class="asm__customer360-overview-info-headline">Loyalty Points</div>
             		  <c:choose>
                    	    <c:when test="${empty loyaltyData}">
                        	    <spring:theme code="text.customer360.yprofile.loyalty.empty" text="There are currently no Loyalty data"/>
                        	</c:when>
                        <c:otherwise>                   
                    		<div class="asm__customer360-overview-info-points-pts">
                    		   <c:choose>                    		   
                    			<c:when test="${not empty currentLoyaltyBalance}">
                        	    	${currentLoyaltyBalance}&nbsp <spring:theme code="text.customer360.yprofile.pts" text="PTS"/>
                        		</c:when>
                        		<c:otherwise>  
                        			<spring:theme code="text.customer360.yprofile.loyaltyBalance.missing" text="000000"/>
                         		</c:otherwise>
                             </c:choose>
                    		</div>
                    		<div class="asm__customer360-overview-info-points-ptsinfo">   
                    			<c:set var="activityScoreValue" value="${fn:escapeXml(loyaltyData.activityScore)}" scope="page"/>                 		
                    			<c:set var="activityScore" value="${not empty activityScoreValue ? activityScoreValue : 'text.customer360.yprofile.activityScore.missing'}" />
                    			<spring:theme code="${activityScore}" text="No Activity Score"/>                     		          		
                    		</div>                    		
                    		<div class="asm__customer360-overview-info-points-medals">               
                    		    			
                        	   <span class="asm__customer360-overview-info-points-medals-item ${silverBadgeStatus}" title="<spring:theme code="text.customer360.yprofile.medal.silver.alt" text ="Silver"/>" />                      
                  		   	   <span class="asm__customer360-overview-info-points-medals-item ${goldBadgeStatus}" title="<spring:theme code="text.customer360.yprofile.medal.gold.alt" text ="Gold"/>" />                     
                     		   <span class="asm__customer360-overview-info-points-medals-item ${platinumBadgeStatus}" title="<spring:theme code="text.customer360.yprofile.medal.platinum.alt" text ="Platinum"/>" />                   
             		       </div>                		   
                     </c:otherwise>
                    </c:choose>
               </div>               
           </div>
           <div class="col-sm-4">
                <div class="asm__customer360-overview-info-is">
                    <div class="asm__customer360-overview-info-headline"><spring:theme code="${name}"/> is</div>
                    <div class="asm__customer360-overview-info-is-tags">

                        <div class="asm__customer360-overview-info-is-tags-item">busy</div>
                        <div class="asm__customer360-overview-info-is-tags-item">on-the-go</div>
                        <div class="asm__customer360-overview-info-is-tags-item">early-adopting</div>
                        <div class="asm__customer360-overview-info-is-tags-item">trendy</div>
                        <div class="asm__customer360-overview-info-is-tags-item">frequent buyer</div>
                        <div class="asm__customer360-overview-info-is-tags-item">tech savvy</div>
                        <div class="asm__customer360-overview-info-is-tags-item">photographer</div>
                    </div>
                </div>
           </div>
           <div class="col-sm-4">
                <div class="asm__customer360-overview-info-uses">
                    <div class="asm__customer360-overview-info-headline"><spring:theme code="${name}"/> uses</div>
                    <c:choose>
                        <c:when test="${empty technologyUsedDataList}">
                            <spring:theme code="text.customer360.yprofile.devices.empty"/>
                        </c:when>
                        <c:otherwise>                     	  
                            <table class="asm__customer360-overview-info-table">
                                <tr>
                                    <c:forEach items="${technologyUsedDataList}" var="index">
                                        <td><div class="asm__customer360-overview-info-uses-icon asm__customer360-overview-info-uses-icon-${fn:escapeXml(index.device)}"></div></td>
                                    </c:forEach>
                                </tr>
                                <tr>
                                    <c:forEach items="${technologyUsedDataList}" var="index">
                                        <td>
                                            <div class="asm__customer360-overview-info-uses-value">${fn:escapeXml(index.percentage)}%</div>
                                            <div class="asm__customer360-overview-info-uses-name">${fn:replace(fn:escapeXml(index.device), '_',' ')}</div>
                                        </td>
                                    </c:forEach>
                                </tr>
                                <tr>
                                    <c:forEach items="${technologyUsedDataList}" var="index">
                                        <td>
                                            <div class="asm__customer360-overview-info-uses-device">${fn:replace(fn:escapeXml(index.operatingSystem), '_',' ')}<br>${fn:replace(fn:escapeXml(index.browser), '_',' ')}</div>
                                        </td>
                                    </c:forEach>
                                </tr>
                                <tr>
                                    <c:forEach items="${technologyUsedDataList}" var="index">
                                        <td>
                                            <div class="asm__customer360-overview-info-uses-browser asm__customer360-overview-info-uses-browser-${fn:escapeXml(index.browser)}"></div>
                                        </td>
                                    </c:forEach>
                                </tr>
                            </table>
                        </c:otherwise>
                    </c:choose>
                </div>
           </div>
       </div>
    </div>
</div>