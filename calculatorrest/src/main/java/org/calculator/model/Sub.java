package org.calculator.model;

public class Sub implements  IOperator{
    @Override
    public long execute(int num1, int num2) {
        return num1-num2;
    }
}
