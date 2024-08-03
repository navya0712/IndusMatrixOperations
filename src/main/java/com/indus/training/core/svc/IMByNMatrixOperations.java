package com.indus.training.core.svc;

import com.indus.training.core.domain.MByNMatrixOperationsInput;
import com.indus.training.core.domain.MByNMatrixOperationsOutput;

/**
 * Provides operations for MxN matrix calculations.
 */
public interface IMByNMatrixOperations {

	/**
	 * Adds two MxN matrices.
	 * 
	 * @param matOpInObj the input object containing the two matrices to be added
	 * @return the output object containing the result of the addition
	 */
	public MByNMatrixOperationsOutput add(MByNMatrixOperationsInput matOpInObj);

	/**
	 * Multiplies two MxN matrices.
	 * 
	 * @param matOpInObj the input object containing the two matrices to be
	 *                   multiplied
	 * @return the output object containing the result of the multiplication
	 */
	public MByNMatrixOperationsOutput multiply(MByNMatrixOperationsInput matOpInObj);

}
