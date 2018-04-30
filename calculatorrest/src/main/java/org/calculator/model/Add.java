package org.calculator.model;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Add implements  IOperator{
    private static Add obj;

    private Add (){

    }

    public static Add getInstance(){
        if(obj == null){
            return new Add();
        }
        return obj;
    }

    @Override
    public double execute(List<Double> list) {
        return list.stream().reduce(new Double(0),(a, b) -> a + b);
    }
}
