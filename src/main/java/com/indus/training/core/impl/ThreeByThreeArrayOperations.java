package com.indus.training.core.impl;

import com.indus.training.core.domain.ThreeByThreeArrayOperationsInput;
import com.indus.training.core.domain.ThreeByThreeArrayOperationsOutput;
import com.indus.training.core.svc.IThreeByThreeArrayOperations;

public class ThreeByThreeArrayOperations implements IThreeByThreeArrayOperations {

	@Override
	public ThreeByThreeArrayOperationsOutput add(ThreeByThreeArrayOperationsInput arOpInpObj) {

		ThreeByThreeArrayOperationsOutput arOpOutObj = null;
		{
			double[][] param1 = arOpInpObj.param1;
			double[][] param2 = arOpInpObj.param2;
			double[][] result = new double[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					result[i][j] = param1[i][j] + param2[i][j];
				}
			}
			arOpOutObj = new ThreeByThreeArrayOperationsOutput();
			arOpOutObj.param1 = param1;
			arOpOutObj.param2 = param2;
			arOpOutObj.result = result;

		}

		return arOpOutObj;
	}

	@Override
	public ThreeByThreeArrayOperationsOutput multiply(ThreeByThreeArrayOperationsInput arOpInpObj) {

		ThreeByThreeArrayOperationsOutput arOpOutObj = null;
		{
			double[][] param1 = arOpInpObj.param1;
			double[][] param2 = arOpInpObj.param2;
			double[][] result = new double[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					result[i][j] = 0;
					for (int k = 0; k < 3; k++) {
						result[i][j] = result[i][j] + param1[i][k] * param2[k][j];

					}
				}
			}
			arOpOutObj = new ThreeByThreeArrayOperationsOutput();
			arOpOutObj.param1 = param1;
			arOpOutObj.param2 = param2;
			arOpOutObj.result = result;

		}
		return arOpOutObj;
	}

}
