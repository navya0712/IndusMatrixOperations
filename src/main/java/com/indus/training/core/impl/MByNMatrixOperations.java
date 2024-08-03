package com.indus.training.core.impl;

import com.indus.training.core.domain.MByNMatrixOperationsInput;
import com.indus.training.core.domain.MByNMatrixOperationsOutput;
import com.indus.training.core.svc.IMByNMatrixOperations;

public class MByNMatrixOperations implements IMByNMatrixOperations {

	@Override
	public MByNMatrixOperationsOutput add(MByNMatrixOperationsInput matOpInObj) {
		MByNMatrixOperationsOutput matOpOutObj = null;
		{
			double param1[][] = matOpInObj.param1;
			double param2[][] = matOpInObj.param2;
			double result[][] = new double[param1.length][param1[0].length];
			matOpOutObj = new MByNMatrixOperationsOutput();
			for (int i = 0; i < param1.length; i++) {
				for (int j = 0; j < param1[i].length; j++) {
					result[i][j] = param1[i][j] + param2[i][j];
				}
			}
			matOpOutObj.param1 = param1;
			matOpOutObj.param2 = param2;
			matOpOutObj.result = result;

		}
		return matOpOutObj;
	}

	@Override
	public MByNMatrixOperationsOutput multiply(MByNMatrixOperationsInput matOpInObj) {
		MByNMatrixOperationsOutput matOpOutObj = null;
		{
			double param1[][] = matOpInObj.param1;
			double param2[][] = matOpInObj.param2;
			double result[][] = new double[param1.length][param2[0].length];
			matOpOutObj = new MByNMatrixOperationsOutput();
			for (int i = 0; i < param1.length; i++) {
				{
					for (int j = 0; j < param2[0].length; j++) {
						result[i][j] = 0;
						for (int k = 0; k < param2.length; k++) {
							result[i][j] = result[i][j] + param1[i][k] * param2[k][j];

						}
					}

				}

			}
			matOpOutObj.param1 = param1;
			matOpOutObj.param2 = param2;
			matOpOutObj.result = result;

		}
		return matOpOutObj;

	}

}
