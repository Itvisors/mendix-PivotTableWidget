// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class TransientIncidentPivotTableCellRow
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject transientIncidentPivotTableCellRowMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.TransientIncidentPivotTableCellRow";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		incidentDate("incidentDate"),
		incidentTitle("incidentTitle"),
		incidentDescription("incidentDescription"),
		employeeNumber("employeeNumber"),
		employeeName("employeeName"),
		TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell("MyFirstModule.TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TransientIncidentPivotTableCellRow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.TransientIncidentPivotTableCellRow"));
	}

	protected TransientIncidentPivotTableCellRow(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject transientIncidentPivotTableCellRowMendixObject)
	{
		if (transientIncidentPivotTableCellRowMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.TransientIncidentPivotTableCellRow", transientIncidentPivotTableCellRowMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.TransientIncidentPivotTableCellRow");

		this.transientIncidentPivotTableCellRowMendixObject = transientIncidentPivotTableCellRowMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TransientIncidentPivotTableCellRow.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.TransientIncidentPivotTableCellRow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.TransientIncidentPivotTableCellRow.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.TransientIncidentPivotTableCellRow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.TransientIncidentPivotTableCellRow(context, mendixObject);
	}

	public static myfirstmodule.proxies.TransientIncidentPivotTableCellRow load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TransientIncidentPivotTableCellRow.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of incidentDate
	 */
	public final java.util.Date getincidentDate()
	{
		return getincidentDate(getContext());
	}

	/**
	 * @param context
	 * @return value of incidentDate
	 */
	public final java.util.Date getincidentDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.incidentDate.toString());
	}

	/**
	 * Set value of incidentDate
	 * @param incidentdate
	 */
	public final void setincidentDate(java.util.Date incidentdate)
	{
		setincidentDate(getContext(), incidentdate);
	}

	/**
	 * Set value of incidentDate
	 * @param context
	 * @param incidentdate
	 */
	public final void setincidentDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date incidentdate)
	{
		getMendixObject().setValue(context, MemberNames.incidentDate.toString(), incidentdate);
	}

	/**
	 * @return value of incidentTitle
	 */
	public final java.lang.String getincidentTitle()
	{
		return getincidentTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of incidentTitle
	 */
	public final java.lang.String getincidentTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.incidentTitle.toString());
	}

	/**
	 * Set value of incidentTitle
	 * @param incidenttitle
	 */
	public final void setincidentTitle(java.lang.String incidenttitle)
	{
		setincidentTitle(getContext(), incidenttitle);
	}

	/**
	 * Set value of incidentTitle
	 * @param context
	 * @param incidenttitle
	 */
	public final void setincidentTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String incidenttitle)
	{
		getMendixObject().setValue(context, MemberNames.incidentTitle.toString(), incidenttitle);
	}

	/**
	 * @return value of incidentDescription
	 */
	public final java.lang.String getincidentDescription()
	{
		return getincidentDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of incidentDescription
	 */
	public final java.lang.String getincidentDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.incidentDescription.toString());
	}

	/**
	 * Set value of incidentDescription
	 * @param incidentdescription
	 */
	public final void setincidentDescription(java.lang.String incidentdescription)
	{
		setincidentDescription(getContext(), incidentdescription);
	}

	/**
	 * Set value of incidentDescription
	 * @param context
	 * @param incidentdescription
	 */
	public final void setincidentDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String incidentdescription)
	{
		getMendixObject().setValue(context, MemberNames.incidentDescription.toString(), incidentdescription);
	}

	/**
	 * @return value of employeeNumber
	 */
	public final java.lang.Long getemployeeNumber()
	{
		return getemployeeNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of employeeNumber
	 */
	public final java.lang.Long getemployeeNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.employeeNumber.toString());
	}

	/**
	 * Set value of employeeNumber
	 * @param employeenumber
	 */
	public final void setemployeeNumber(java.lang.Long employeenumber)
	{
		setemployeeNumber(getContext(), employeenumber);
	}

	/**
	 * Set value of employeeNumber
	 * @param context
	 * @param employeenumber
	 */
	public final void setemployeeNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long employeenumber)
	{
		getMendixObject().setValue(context, MemberNames.employeeNumber.toString(), employeenumber);
	}

	/**
	 * @return value of employeeName
	 */
	public final java.lang.String getemployeeName()
	{
		return getemployeeName(getContext());
	}

	/**
	 * @param context
	 * @return value of employeeName
	 */
	public final java.lang.String getemployeeName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.employeeName.toString());
	}

	/**
	 * Set value of employeeName
	 * @param employeename
	 */
	public final void setemployeeName(java.lang.String employeename)
	{
		setemployeeName(getContext(), employeename);
	}

	/**
	 * Set value of employeeName
	 * @param context
	 * @param employeename
	 */
	public final void setemployeeName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String employeename)
	{
		getMendixObject().setValue(context, MemberNames.employeeName.toString(), employeename);
	}

	/**
	 * @return value of TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell
	 */
	public final myfirstmodule.proxies.TransientIncidentPivotTableCell getTransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell() throws com.mendix.core.CoreException
	{
		return getTransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell(getContext());
	}

	/**
	 * @param context
	 * @return value of TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell
	 */
	public final myfirstmodule.proxies.TransientIncidentPivotTableCell getTransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.TransientIncidentPivotTableCell result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.TransientIncidentPivotTableCell.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell
	 * @param transientincidentpivottablecellrow_transientincidentpivottablecell
	 */
	public final void setTransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell(myfirstmodule.proxies.TransientIncidentPivotTableCell transientincidentpivottablecellrow_transientincidentpivottablecell)
	{
		setTransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell(getContext(), transientincidentpivottablecellrow_transientincidentpivottablecell);
	}

	/**
	 * Set value of TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell
	 * @param context
	 * @param transientincidentpivottablecellrow_transientincidentpivottablecell
	 */
	public final void setTransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.TransientIncidentPivotTableCell transientincidentpivottablecellrow_transientincidentpivottablecell)
	{
		if (transientincidentpivottablecellrow_transientincidentpivottablecell == null)
			getMendixObject().setValue(context, MemberNames.TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TransientIncidentPivotTableCellRow_TransientIncidentPivotTableCell.toString(), transientincidentpivottablecellrow_transientincidentpivottablecell.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return transientIncidentPivotTableCellRowMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
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
			final myfirstmodule.proxies.TransientIncidentPivotTableCellRow that = (myfirstmodule.proxies.TransientIncidentPivotTableCellRow) obj;
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
	public static java.lang.String getType()
	{
		return "MyFirstModule.TransientIncidentPivotTableCellRow";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
