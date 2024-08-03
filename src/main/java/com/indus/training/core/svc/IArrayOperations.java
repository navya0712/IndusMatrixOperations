package com.indus.training.core.svc;

import com.indus.training.core.domain.ArrayOperationsInput;
import com.indus.training.core.domain.ArrayOperationsOutput;

/**
 * Provides operations for 2x2 array (matrix) calculations.
 */
public interface IArrayOperations {

	/**
	 * Adds two 2x2 matrices.
	 * 
	 * @param arOpInpObj the input object containing the two matrices to be added
	 * @return the output object containing the result of the addition
	 */
	public ArrayOperationsOutput add(ArrayOperationsInput arOpInpObj);

	/**
	 * Multiplies two 2x2 matrices.
	 * 
	 * @param arOpInpObj the input object containing the two matrices to be
	 *                   multiplied
	 * @return the output object containing the result of the multiplication
	 */
	public ArrayOperationsOutput multiply(ArrayOperationsInput arOpInpObj);

}
