package com.indus.training.core.svc;

import com.indus.training.core.domain.ThreeByThreeArrayOperationsInput;
import com.indus.training.core.domain.ThreeByThreeArrayOperationsOutput;

/**
 * Provides operations for 3x3 array (matrix) calculations.
 */
public interface IThreeByThreeArrayOperations {

	/**
	 * Adds two 3x3 matrices.
	 * 
	 * @param arOpInpObj the input object containing the two 3x3 matrices to be
	 *                   added
	 * @return the output object containing the result of the addition
	 */
	public ThreeByThreeArrayOperationsOutput add(ThreeByThreeArrayOperationsInput arOpInpObj);

	/**
	 * Multiplies two 3x3 matrices.
	 * 
	 * @param arOpInpObj the input object containing the two 3x3 matrices to be
	 *                   multiplied
	 * @return the output object containing the result of the multiplication
	 */
	public ThreeByThreeArrayOperationsOutput multiply(ThreeByThreeArrayOperationsInput arOpInpObj);
}
