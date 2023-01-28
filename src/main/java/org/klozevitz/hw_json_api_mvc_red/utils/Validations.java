package org.klozevitz.hw_json_api_mvc_red.logic;

import org.klozevitz.hw_json_api_mvc_red.Input;

public class Validations {
// input level validations

    // operation - arguments amount check
    public static boolean isRequestValid(Input input) {
        System.out.println("sum, diff, mult".contains(input.operation));
        System.out.println(input.lo1);
        System.out.println(input.lo2);
        return ("sum, diff, mult".contains(input.operation) &&
                (input.lo1 != null && input.lo2 != null)) ||
                (input.operation.equals("det") && input.lo1 != null);
    }

    // sum-diff dimension check
    public static boolean canBeSummarized(LinearOperator lo1, LinearOperator lo2) {
        return lo1.getOperator().length == lo2.getOperator().length &&
                lo1.getOperator()[0].length == lo2.getOperator()[0].length;
    }

    // multiply dimension check
    public static boolean canBeMultiplied(LinearOperator lo1, LinearOperator lo2) {
        return (lo1.getOperator().length == lo2.getOperator()[0].length &&
                lo1.getOperator()[0].length == lo2.getOperator().length) ||
                (lo1.getOperator().length == 1 || lo2.getOperator().length == 1);
    }


//  service layer validations

    // square operator check
    public static boolean isSqr(LinearOperator lo) {
        return lo.getOperator().length == lo.getOperator()[0].length;
    }
}
