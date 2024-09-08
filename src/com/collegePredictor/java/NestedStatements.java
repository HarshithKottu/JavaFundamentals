package com.collegePredictor.java;

public class NestedStatements {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 3; j++) {
                if (i == j)
                    // breaks the outer loop when the condition is true
                    break outer;
                System.out.println(i + ' ' + j);
            }
        }
    }
}
