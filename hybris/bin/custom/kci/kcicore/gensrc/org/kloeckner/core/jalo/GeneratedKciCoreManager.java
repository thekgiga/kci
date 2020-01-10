/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 10, 2020 5:08:22 PM                     ---
 * ----------------------------------------------------------------
 */
package org.kloeckner.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.User;
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
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("orderConfirmationEmailAddresses", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.User", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>User.orderConfirmationEmailAddresses</code> attribute.
	 * @return the orderConfirmationEmailAddresses
	 */
	public List<KciEmailAddress> getOrderConfirmationEmailAddresses(final SessionContext ctx, final User item)
	{
		List<KciEmailAddress> coll = (List<KciEmailAddress>)item.getProperty( ctx, KciCoreConstants.Attributes.User.ORDERCONFIRMATIONEMAILADDRESSES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.orderConfirmationEmailAddresses</code> attribute.
	 * @return the orderConfirmationEmailAddresses
	 */
	public List<KciEmailAddress> getOrderConfirmationEmailAddresses(final User item)
	{
		return getOrderConfirmationEmailAddresses( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.orderConfirmationEmailAddresses</code> attribute. 
	 * @param value the orderConfirmationEmailAddresses
	 */
	public void setOrderConfirmationEmailAddresses(final SessionContext ctx, final User item, final List<KciEmailAddress> value)
	{
		item.setProperty(ctx, KciCoreConstants.Attributes.User.ORDERCONFIRMATIONEMAILADDRESSES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.orderConfirmationEmailAddresses</code> attribute. 
	 * @param value the orderConfirmationEmailAddresses
	 */
	public void setOrderConfirmationEmailAddresses(final User item, final List<KciEmailAddress> value)
	{
		setOrderConfirmationEmailAddresses( getSession().getSessionContext(), item, value );
	}
	
}
