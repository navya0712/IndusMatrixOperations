package com.indus.training.core.svc;

import java.util.Arrays;

import com.indus.training.core.domain.MByNMatrixOperationsInput;
import com.indus.training.core.domain.MByNMatrixOperationsOutput;
import com.indus.training.core.impl.MByNMatrixOperations;

import junit.framework.TestCase;

/**
 * Provides Test Cases for MByNMatrixOperations
 */
public class TestMByNMatrixOperations extends TestCase {

	private MByNMatrixOperations mByNMatOpObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		mByNMatOpObj = new MByNMatrixOperations();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		mByNMatOpObj = null;
	}

	/**
	 * Test case for addition
	 */
	public void testAdd() {

		// 1. Inputs
		MByNMatrixOperationsInput matOpInpObj = new MByNMatrixOperationsInput();
		matOpInpObj.param1 = new double[][] { { 2, 3 }, { 4, 5 } };
		matOpInpObj.param2 = new double[][] { { 4, 3 }, { 2, 5 } };

		// 2. Expected Result
		MByNMatrixOperationsOutput expMatOpOutObj = new MByNMatrixOperationsOutput();
		expMatOpOutObj.param1 = new double[][] { { 2, 3 }, { 4, 5 } };
		expMatOpOutObj.param2 = new double[][] { { 4, 3 }, { 2, 5 } };
		expMatOpOutObj.result = new double[][] { { 6, 6 }, { 6, 10 } };

		// 3. Actual Result
		MByNMatrixOperationsOutput actMatOpOutObj = mByNMatOpObj.add(matOpInpObj);

		// 4. Assertion
		assertTrue(Arrays.deepEquals(expMatOpOutObj.param1, actMatOpOutObj.param1));
		assertTrue(Arrays.deepEquals(expMatOpOutObj.param2, actMatOpOutObj.param2));
		assertTrue(Arrays.deepEquals(expMatOpOutObj.result, actMatOpOutObj.result));

	}

	/**
	 * Test case for multiplication
	 */
	public void testMultiply() {

		// 1. Inputs
		MByNMatrixOperationsInput matOpInpObj = new MByNMatrixOperationsInput();
		matOpInpObj.param1 = new double[][] { { 1, 2 }, { 1, 1 }, { 2, 1 } };
		matOpInpObj.param2 = new double[][] { { 1, 2, 1 }, { 1, 1, 1 } };

		// 2. Expected Result
		MByNMatrixOperationsOutput expMatOpOutObj = new MByNMatrixOperationsOutput();
		expMatOpOutObj.param1 = new double[][] { { 1, 2 }, { 1, 1 }, { 2, 1 } };
		expMatOpOutObj.param2 = new double[][] { { 1, 2, 1 }, { 1, 1, 1 } };
		expMatOpOutObj.result = new double[][] { { 3, 4, 3 }, { 2, 3, 2 }, { 3, 5, 3 } };

		// 3. Actual Result
		MByNMatrixOperationsOutput actMatOpOutObj = mByNMatOpObj.multiply(matOpInpObj);

		// 4. Assertion
		assertTrue(Arrays.deepEquals(expMatOpOutObj.param1, actMatOpOutObj.param1));
		assertTrue(Arrays.deepEquals(expMatOpOutObj.param2, actMatOpOutObj.param2));
		assertTrue(Arrays.deepEquals(expMatOpOutObj.result, actMatOpOutObj.result));
	}

}
