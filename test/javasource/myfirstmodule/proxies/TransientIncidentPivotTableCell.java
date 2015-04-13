// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class TransientIncidentPivotTableCell
{
	private final IMendixObject transientIncidentPivotTableCellMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.TransientIncidentPivotTableCell";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		categoryNumber("categoryNumber"),
		categoryName("categoryName"),
		carrierNumber("carrierNumber"),
		carrierName("carrierName"),
		TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters("MyFirstModule.TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public TransientIncidentPivotTableCell(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.TransientIncidentPivotTableCell"));
	}

	protected TransientIncidentPivotTableCell(IContext context, IMendixObject transientIncidentPivotTableCellMendixObject)
	{
		if (transientIncidentPivotTableCellMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MyFirstModule.TransientIncidentPivotTableCell", transientIncidentPivotTableCellMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.TransientIncidentPivotTableCell");

		this.transientIncidentPivotTableCellMendixObject = transientIncidentPivotTableCellMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TransientIncidentPivotTableCell.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.TransientIncidentPivotTableCell initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.TransientIncidentPivotTableCell.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.TransientIncidentPivotTableCell initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.TransientIncidentPivotTableCell(context, mendixObject);
	}

	public static myfirstmodule.proxies.TransientIncidentPivotTableCell load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TransientIncidentPivotTableCell.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of categoryNumber
	 */
	public final Long getcategoryNumber()
	{
		return getcategoryNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of categoryNumber
	 */
	public final Long getcategoryNumber(IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.categoryNumber.toString());
	}

	/**
	 * Set value of categoryNumber
	 * @param categorynumber
	 */
	public final void setcategoryNumber(Long categorynumber)
	{
		setcategoryNumber(getContext(), categorynumber);
	}

	/**
	 * Set value of categoryNumber
	 * @param context
	 * @param categorynumber
	 */
	public final void setcategoryNumber(IContext context, Long categorynumber)
	{
		getMendixObject().setValue(context, MemberNames.categoryNumber.toString(), categorynumber);
	}

	/**
	 * @return value of categoryName
	 */
	public final String getcategoryName()
	{
		return getcategoryName(getContext());
	}

	/**
	 * @param context
	 * @return value of categoryName
	 */
	public final String getcategoryName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.categoryName.toString());
	}

	/**
	 * Set value of categoryName
	 * @param categoryname
	 */
	public final void setcategoryName(String categoryname)
	{
		setcategoryName(getContext(), categoryname);
	}

	/**
	 * Set value of categoryName
	 * @param context
	 * @param categoryname
	 */
	public final void setcategoryName(IContext context, String categoryname)
	{
		getMendixObject().setValue(context, MemberNames.categoryName.toString(), categoryname);
	}

	/**
	 * @return value of carrierNumber
	 */
	public final Long getcarrierNumber()
	{
		return getcarrierNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of carrierNumber
	 */
	public final Long getcarrierNumber(IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.carrierNumber.toString());
	}

	/**
	 * Set value of carrierNumber
	 * @param carriernumber
	 */
	public final void setcarrierNumber(Long carriernumber)
	{
		setcarrierNumber(getContext(), carriernumber);
	}

	/**
	 * Set value of carrierNumber
	 * @param context
	 * @param carriernumber
	 */
	public final void setcarrierNumber(IContext context, Long carriernumber)
	{
		getMendixObject().setValue(context, MemberNames.carrierNumber.toString(), carriernumber);
	}

	/**
	 * @return value of carrierName
	 */
	public final String getcarrierName()
	{
		return getcarrierName(getContext());
	}

	/**
	 * @param context
	 * @return value of carrierName
	 */
	public final String getcarrierName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.carrierName.toString());
	}

	/**
	 * Set value of carrierName
	 * @param carriername
	 */
	public final void setcarrierName(String carriername)
	{
		setcarrierName(getContext(), carriername);
	}

	/**
	 * Set value of carrierName
	 * @param context
	 * @param carriername
	 */
	public final void setcarrierName(IContext context, String carriername)
	{
		getMendixObject().setValue(context, MemberNames.carrierName.toString(), carriername);
	}

	/**
	 * @return value of TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters
	 */
	public final myfirstmodule.proxies.TransientIncidentPivotTableParameters getTransientIncidentPivotTableCell_TransientIncidentPivotTableParameters() throws CoreException
	{
		return getTransientIncidentPivotTableCell_TransientIncidentPivotTableParameters(getContext());
	}

	/**
	 * @param context
	 * @return value of TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters
	 */
	public final myfirstmodule.proxies.TransientIncidentPivotTableParameters getTransientIncidentPivotTableCell_TransientIncidentPivotTableParameters(IContext context) throws CoreException
	{
		myfirstmodule.proxies.TransientIncidentPivotTableParameters result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.TransientIncidentPivotTableParameters.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters
	 * @param transientincidentpivottablecell_transientincidentpivottableparameters
	 */
	public final void setTransientIncidentPivotTableCell_TransientIncidentPivotTableParameters(myfirstmodule.proxies.TransientIncidentPivotTableParameters transientincidentpivottablecell_transientincidentpivottableparameters)
	{
		setTransientIncidentPivotTableCell_TransientIncidentPivotTableParameters(getContext(), transientincidentpivottablecell_transientincidentpivottableparameters);
	}

	/**
	 * Set value of TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters
	 * @param context
	 * @param transientincidentpivottablecell_transientincidentpivottableparameters
	 */
	public final void setTransientIncidentPivotTableCell_TransientIncidentPivotTableParameters(IContext context, myfirstmodule.proxies.TransientIncidentPivotTableParameters transientincidentpivottablecell_transientincidentpivottableparameters)
	{
		if (transientincidentpivottablecell_transientincidentpivottableparameters == null)
			getMendixObject().setValue(context, MemberNames.TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TransientIncidentPivotTableCell_TransientIncidentPivotTableParameters.toString(), transientincidentpivottablecell_transientincidentpivottableparameters.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return transientIncidentPivotTableCellMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.TransientIncidentPivotTableCell that = (myfirstmodule.proxies.TransientIncidentPivotTableCell) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "MyFirstModule.TransientIncidentPivotTableCell";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
