package org.eclipse.xtext.parsetree.reconstr;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;

/**
 * In the process of serializing a model to a DSL, references to model elements
 * need to be turned into string representations which identify the targeted
 * model element. Implementations of this interface compute this string
 * representation.
 * 
 * Implementations must be synchronous with the DSL's parser implementation.
 * 
 * Implementations might introduce some kind of scoping.
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 */
public interface ICrossReferenceSerializer {

	/**
	 * Calculates a String which is a valid reference to the 'target' object
	 * within the DSL.
	 * 
	 * @param container
	 *            The object which contains the reference
	 * @param grammarElement
	 *            The grammar element describing the cross reference
	 * @param target
	 *            the referenced object
	 * @return A string representing a reference the target object.
	 */
	public String serializeCrossRef(IInstanceDescription container,
			CrossReference grammarElement, EObject target);

}
