package org.calculator.model;

public class Add implements  IOperator{

    @Override
    public long execute(int num1, int num2) {
        return num1+num2;
    }
}
