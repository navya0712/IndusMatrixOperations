package com.indus.training.core.svc;

import java.util.Arrays;

import com.indus.training.core.domain.ThreeByThreeArrayOperationsInput;
import com.indus.training.core.domain.ThreeByThreeArrayOperationsOutput;
import com.indus.training.core.impl.ThreeByThreeArrayOperations;

import junit.framework.TestCase;

/**
 * Provides Test Cases for ThreeByThreeArrayOperations
 */
public class TestThreeByThreeArrayOperations extends TestCase {

	private ThreeByThreeArrayOperations arOpObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		arOpObj = new ThreeByThreeArrayOperations();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		arOpObj = null;

	}

	/**
	 * Test Case for addition
	 */
	public void testAdd() {

		// 1. Inputs
		ThreeByThreeArrayOperationsInput arOpInObj = new ThreeByThreeArrayOperationsInput();
		arOpInObj.param1 = new double[][] { { 1.0, 2.0, 3.0 }, { 3.0, 4.0, 6.0 }, { 1, 2, 3 } };
		arOpInObj.param2 = new double[][] { { 3.0, 4.0, 5.0 }, { 5.0, 6.0, 7.0 }, { 1, 2, 3 } };

		// 2. Expected Result
		ThreeByThreeArrayOperationsOutput expArOpOutObj = new ThreeByThreeArrayOperationsOutput();
		expArOpOutObj.param1 = new double[][] { { 1.0, 2.0, 3.0 }, { 3.0, 4.0, 6.0 }, { 1, 2, 3 } };
		expArOpOutObj.param2 = new double[][] { { 3.0, 4.0, 5.0 }, { 5.0, 6.0, 7.0 }, { 1, 2, 3 } };
		expArOpOutObj.result = new double[][] { { 4.0, 6.0, 8.0 }, { 8.0, 10.0, 13.0 }, { 2, 4, 6 } };

		// 3. Actual Result
		ThreeByThreeArrayOperationsOutput actArOpOutObj = arOpObj.add(arOpInObj);

		// 4. Assertion
		assertTrue(Arrays.deepEquals(expArOpOutObj.param1, actArOpOutObj.param1));
		assertTrue(Arrays.deepEquals(expArOpOutObj.param2, actArOpOutObj.param2));
		assertTrue(Arrays.deepEquals(expArOpOutObj.result, actArOpOutObj.result));
	}

	/**
	 * Test Case for multiplication
	 */
	public void testMultiply() {

		// 1. Inputs
		ThreeByThreeArrayOperationsInput arOpInObj = new ThreeByThreeArrayOperationsInput();
		arOpInObj.param1 = new double[][] { { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 } };
		arOpInObj.param2 = new double[][] { { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 } };

		// 2. Expected Result
		ThreeByThreeArrayOperationsOutput expArOpOutObj = new ThreeByThreeArrayOperationsOutput();
		expArOpOutObj.param1 = new double[][] { { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 } };
		expArOpOutObj.param2 = new double[][] { { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 } };
		expArOpOutObj.result = new double[][] { { 3.0, 3.0, 3.0 }, { 3.0, 3.0, 3.0 }, { 3.0, 3.0, 3.0 } };

		// 3. Actual Result
		ThreeByThreeArrayOperationsOutput actArOpOutObj = arOpObj.multiply(arOpInObj);

		// 4. Assertion
		assertTrue(Arrays.deepEquals(expArOpOutObj.param1, actArOpOutObj.param1));
		assertTrue(Arrays.deepEquals(expArOpOutObj.param2, actArOpOutObj.param2));
		assertTrue(Arrays.deepEquals(expArOpOutObj.result, actArOpOutObj.result));
	}

}
