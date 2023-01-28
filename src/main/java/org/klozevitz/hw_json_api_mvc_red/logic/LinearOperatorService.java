package org.klozevitz.hw_json_api_mvc.service;


import org.klozevitz.hw_json_api_mvc.logic.ISolution;
import org.klozevitz.hw_json_api_mvc.logic.LinearOperator;

import static org.klozevitz.hw_json_api_mvc.utilities.Validations.*;

public class LinearOperatorService implements ISolution {

    @Override
    public Object answer(String operation, LinearOperator lo1, LinearOperator lo2) {
        return chooseOperation(operation, lo1, lo2);
    }

//operation choice method
    private Object chooseOperation(String operation, LinearOperator lo1, LinearOperator lo2) {
        if (!isRequestValid(operation, lo1, lo2))
            return ("Wrong arguments");
        if (operation.equals("sum"))
            return sum(lo1, lo2);
        if (operation.equals("diff"))
            return diff(lo1, lo2);
        if (operation.equals("mult"))
            return mult(lo1, lo2);
        if (operation.equals("det"))
            return det(lo1);
        return ("Wrong operation");
    }

    private Object sum(LinearOperator lo1, LinearOperator lo2) {
        if (!canBeSummarized(lo1, lo2))
            return ("Wrong linear operators dimensions");
        lo1.sum(lo2);
        return lo1;
    }

    private Object diff(LinearOperator lo1, LinearOperator lo2) {
        if (!canBeSummarized(lo1, lo2))
            return ("Wrong linear operators dimensions");
        lo1.diff(lo2);
        return lo1;
    }

    private Object mult(LinearOperator lo1, LinearOperator lo2) {
        if (!canBeMultiplied(lo1, lo2))
            return ("Wrong linear operators dimensions");
        lo1.multiply(lo2);
        return lo1;
    }

    private Object det(LinearOperator lo) {
        if (!isSqr(lo))
            return ("Wrong linear operator dimension: cannot " + "get a non-square operator determinant");
        return lo.determinant();
    }
}
