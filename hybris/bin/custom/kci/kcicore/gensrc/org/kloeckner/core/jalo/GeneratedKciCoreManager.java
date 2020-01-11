/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 11, 2020 2:11:07 AM                     ---
 * ----------------------------------------------------------------
 */
package org.kloeckner.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.kloeckner.core.constants.KciCoreConstants;
import org.kloeckner.core.jalo.ApparelProduct;
import org.kloeckner.core.jalo.ApparelSizeVariantProduct;
import org.kloeckner.core.jalo.ApparelStyleVariantProduct;
import org.kloeckner.core.jalo.ElectronicsColorVariantProduct;
import org.kloeckner.core.jalo.KciEmailAddress;

/**
 * Generated class for type <code>KciCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedKciCoreManager extends Extension
{
	/** Relation ordering override parameter constants for KciEmailAddress2UserRelation from ((kcicore))*/
	protected static String KCIEMAILADDRESS2USERRELATION_SRC_ORDERED = "relation.KciEmailAddress2UserRelation.source.ordered";
	protected static String KCIEMAILADDRESS2USERRELATION_TGT_ORDERED = "relation.KciEmailAddress2UserRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for KciEmailAddress2UserRelation from ((kcicore))*/
	protected static String KCIEMAILADDRESS2USERRELATION_MARKMODIFIED = "relation.KciEmailAddress2UserRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( KciCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( KciCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( KciCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( KciCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public KciEmailAddress createKciEmailAddress(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( KciCoreConstants.TC.KCIEMAILADDRESS );
			return (KciEmailAddress)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating KciEmailAddress : "+e.getMessage(), 0 );
		}
	}
	
	public KciEmailAddress createKciEmailAddress(final Map attributeValues)
	{
		return createKciEmailAddress( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return KciCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.orderConfirmationEmails</code> attribute.
	 * @return the orderConfirmationEmails
	 */
	public Collection<KciEmailAddress> getOrderConfirmationEmails(final SessionContext ctx, final User item)
	{
		final List<KciEmailAddress> items = item.getLinkedItems( 
			ctx,
			false,
			KciCoreConstants.Relations.KCIEMAILADDRESS2USERRELATION,
			"KciEmailAddress",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.orderConfirmationEmails</code> attribute.
	 * @return the orderConfirmationEmails
	 */
	public Collection<KciEmailAddress> getOrderConfirmationEmails(final User item)
	{
		return getOrderConfirmationEmails( getSession().getSessionContext(), item );
	}
	
	public long getOrderConfirmationEmailsCount(final SessionContext ctx, final User item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			KciCoreConstants.Relations.KCIEMAILADDRESS2USERRELATION,
			"KciEmailAddress",
			null
		);
	}
	
	public long getOrderConfirmationEmailsCount(final User item)
	{
		return getOrderConfirmationEmailsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.orderConfirmationEmails</code> attribute. 
	 * @param value the orderConfirmationEmails
	 */
	public void setOrderConfirmationEmails(final SessionContext ctx, final User item, final Collection<KciEmailAddress> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			KciCoreConstants.Relations.KCIEMAILADDRESS2USERRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(KCIEMAILADDRESS2USERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.orderConfirmationEmails</code> attribute. 
	 * @param value the orderConfirmationEmails
	 */
	public void setOrderConfirmationEmails(final User item, final Collection<KciEmailAddress> value)
	{
		setOrderConfirmationEmails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderConfirmationEmails. 
	 * @param value the item to add to orderConfirmationEmails
	 */
	public void addToOrderConfirmationEmails(final SessionContext ctx, final User item, final KciEmailAddress value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			KciCoreConstants.Relations.KCIEMAILADDRESS2USERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(KCIEMAILADDRESS2USERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderConfirmationEmails. 
	 * @param value the item to add to orderConfirmationEmails
	 */
	public void addToOrderConfirmationEmails(final User item, final KciEmailAddress value)
	{
		addToOrderConfirmationEmails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderConfirmationEmails. 
	 * @param value the item to remove from orderConfirmationEmails
	 */
	public void removeFromOrderConfirmationEmails(final SessionContext ctx, final User item, final KciEmailAddress value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			KciCoreConstants.Relations.KCIEMAILADDRESS2USERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(KCIEMAILADDRESS2USERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderConfirmationEmails. 
	 * @param value the item to remove from orderConfirmationEmails
	 */
	public void removeFromOrderConfirmationEmails(final User item, final KciEmailAddress value)
	{
		removeFromOrderConfirmationEmails( getSession().getSessionContext(), item, value );
	}
	
}
