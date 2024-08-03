package com.indus.training.core.domain;

/**
 * Represents the output for operations involving two 3x3 matrices.
 */
public class ThreeByThreeArrayOperationsOutput {

	/**
	 * The first 3x3 matrix involved in the operation.
	 */
	public double[][] param1 = new double[3][3];
	/**
	 * The second 3x3 matrix involved in the operation.
	 */
	public double[][] param2 = new double[3][3];
	/**
	 * The resulting 3x3 matrix from the operation.
	 */
	public double[][] result = new double[3][3];

}
