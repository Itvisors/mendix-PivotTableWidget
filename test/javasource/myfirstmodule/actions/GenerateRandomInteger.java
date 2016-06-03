// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package myfirstmodule.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Generate a random integer based on the supplied maximum value
 */
public class GenerateRandomInteger extends CustomJavaAction<Long>
{
	private Long maxValue;

	public GenerateRandomInteger(IContext context, Long maxValue)
	{
		super(context);
		this.maxValue = maxValue;
	}

	@Override
	public Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		long result;
		
		double randomDouble = Math.random() * maxValue;
		result = Math.round(randomDouble);
		
		return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GenerateRandomInteger";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
