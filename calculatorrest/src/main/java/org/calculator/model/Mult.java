package org.calculator.model;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Mult implements IOperator{

    private static Mult obj;

    private Mult (){

    }

    public static Mult getInstance(){
        if(obj == null){
            return new Mult();
        }
        return obj;
    }

    @Override
    public double execute(List<Double> list) {
        return list.stream().reduce(new Double(1),(a, b) -> a * b);
    }
}
