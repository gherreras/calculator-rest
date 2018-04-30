package org.calculator.model;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public interface IOperator {
    public long execute(int num1, int num2);
    public double execute (List<Double> list);
}
