// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class TransientSalesOrderPivotTableParameters
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject transientSalesOrderPivotTableParametersMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.TransientSalesOrderPivotTableParameters";

	public TransientSalesOrderPivotTableParameters(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.TransientSalesOrderPivotTableParameters"));
	}

	protected TransientSalesOrderPivotTableParameters(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject transientSalesOrderPivotTableParametersMendixObject)
	{
		if (transientSalesOrderPivotTableParametersMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.TransientSalesOrderPivotTableParameters", transientSalesOrderPivotTableParametersMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.TransientSalesOrderPivotTableParameters");

		this.transientSalesOrderPivotTableParametersMendixObject = transientSalesOrderPivotTableParametersMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TransientSalesOrderPivotTableParameters.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.TransientSalesOrderPivotTableParameters initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.TransientSalesOrderPivotTableParameters.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.TransientSalesOrderPivotTableParameters initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.TransientSalesOrderPivotTableParameters(context, mendixObject);
	}

	public static myfirstmodule.proxies.TransientSalesOrderPivotTableParameters load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TransientSalesOrderPivotTableParameters.initialize(context, mendixObject);
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
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return transientSalesOrderPivotTableParametersMendixObject;
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
			final myfirstmodule.proxies.TransientSalesOrderPivotTableParameters that = (myfirstmodule.proxies.TransientSalesOrderPivotTableParameters) obj;
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
		return "MyFirstModule.TransientSalesOrderPivotTableParameters";
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
