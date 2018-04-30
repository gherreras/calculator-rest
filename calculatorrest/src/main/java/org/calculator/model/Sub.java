package org.calculator.model;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Sub implements  IOperator{

    private static Sub obj;

    private Sub (){

    }

    public static Sub getInstance(){
        if(obj == null){
            return new Sub();
        }
        return obj;
    }

    @Override
    public double execute(List<Double> list) {
        Double first = list.get(0);
        return list.stream().skip(1).reduce(first,(a, b) -> a - b);
    }
}
