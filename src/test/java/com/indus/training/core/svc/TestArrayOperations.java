package com.indus.training.core.svc;

import java.util.Arrays;

import com.indus.training.core.domain.ArrayOperationsInput;
import com.indus.training.core.domain.ArrayOperationsOutput;
import com.indus.training.core.impl.ArrayOperations;

import junit.framework.TestCase;

/**
 * Provides Test Cases for ArrayOperations class
 */
public class TestArrayOperations extends TestCase {

	private ArrayOperations arOpObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		arOpObj = new ArrayOperations();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		arOpObj = null;
	}

	/**
	 * Test case for addition of matrices
	 */
	public void testAdd() {

		// 1. Inputs
		ArrayOperationsInput arOpInObj = new ArrayOperationsInput();
		arOpInObj.param1 = new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } };
		arOpInObj.param2 = new double[][] { { 3.0, 4.0 }, { 5.0, 6.0 } };

		// 2. Expected Result
		ArrayOperationsOutput expArOpOutObj = new ArrayOperationsOutput();
		expArOpOutObj.param1 = new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } };
		expArOpOutObj.param2 = new double[][] { { 3.0, 4.0 }, { 5.0, 6.0 } };
		expArOpOutObj.result = new double[][] { { 4.0, 6.0 }, { 8.0, 10.0 } };

		// 3. Actual Result
		ArrayOperationsOutput actArOpOutObj = arOpObj.add(arOpInObj);

		// 4. Assertion
		assertTrue(Arrays.deepEquals(expArOpOutObj.param1, actArOpOutObj.param1));
		assertTrue(Arrays.deepEquals(expArOpOutObj.param2, actArOpOutObj.param2));
		assertTrue(Arrays.deepEquals(expArOpOutObj.result, actArOpOutObj.result));

	}

	/**
	 * Test case for multiplication of matrices
	 */
	public void testMultiply() {
		ArrayOperationsInput arOpInObj = new ArrayOperationsInput();
		arOpInObj.param1 = new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } };
		arOpInObj.param2 = new double[][] { { 3.0, 4.0 }, { 5.0, 6.0 } };

		// 2. Expected Result
		ArrayOperationsOutput expArOpOutObj = new ArrayOperationsOutput();
		expArOpOutObj.param1 = new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } };
		expArOpOutObj.param2 = new double[][] { { 3.0, 4.0 }, { 5.0, 6.0 } };
		expArOpOutObj.result = new double[][] { { 13.0, 16.0 }, { 29.0, 36.0 } };

		// 3. Actual Result
		ArrayOperationsOutput actArOpOutObj = arOpObj.multiply(arOpInObj);

		// 4. Assertion
		assertTrue(Arrays.deepEquals(expArOpOutObj.param1, actArOpOutObj.param1));
		assertTrue(Arrays.deepEquals(expArOpOutObj.param2, actArOpOutObj.param2));
		assertTrue(Arrays.deepEquals(expArOpOutObj.result, actArOpOutObj.result));
	}

}
