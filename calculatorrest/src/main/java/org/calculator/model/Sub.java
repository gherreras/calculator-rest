package org.calculator.model;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Sub implements  IOperator{
    @Override
    public long execute(int num1, int num2) {
        return num1-num2;
    }
    @Override
    public double execute(List<Double> list) {
        Double first = list.get(0);
        return list.stream().skip(1).reduce(first,(a, b) -> a - b);
    }
}
