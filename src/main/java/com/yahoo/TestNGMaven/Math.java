package com.yahoo.TestNGMaven;

import java.util.ArrayList;

public class Math {
    static {
        math = new Math();
    }

    static Math math = null;

    private Math() {
    }

    public int AddArray(ArrayList<Integer> intArray) {
        Integer nSum = 0;
        for (Integer one : intArray) {
            nSum += one;
        }
        return nSum.intValue();
    }

    public static Math GetInstance() {
        return math;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }
}
