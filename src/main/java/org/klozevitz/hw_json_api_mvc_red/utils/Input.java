package org.klozevitz.hw_json_api_mvc_red;

import org.klozevitz.hw_json_api_mvc_red.logic.LinearOperator;

public class Input {
    public String operation;
    public LinearOperator lo1;
    public LinearOperator lo2;

    public Input() {
        operation = "undefined";
    }

    public Input(String operation, double[] m1, double[] m2, int[] md1, int[] md2) {
        this.operation = operation;
        this.lo1 = getLinearOperator(m1, md1);
        this.lo2 = getLinearOperator(m2, md2);
    }

    private LinearOperator getLinearOperator(double[] m, int[] md) {
        if (m.length == 0)
            return null;
        LinearOperator lo = new LinearOperator(new double[md[0]][md[1]]);
        for (int i = 0; i < md[0]; i++)
            for(int j = 0; j < md[1]; j++)
                lo.getOperator()[i][j] = m[i * lo.getOperator()[0].length + j];
        return lo;
    }

    @Override
    public String toString() {
        return "Input{\n" +
                "operation='" + operation + '\'' +
                ", \nm1=" + lo1 +
                ", \nm2=" + lo2 +
                '}';
    }
}
