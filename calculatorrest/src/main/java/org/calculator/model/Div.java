package org.calculator.model;

import org.calculator.util.exception.OperationException;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Div implements IOperator{

    @Override
    public double execute(List<Double> list) throws OperationException{
        Double first = list.get(0);
        if(list.stream().skip(1).filter(aDouble -> aDouble == 0).findFirst().isPresent()){
            throw new OperationException("This operation can't perform a division by zero");
        }
        return list.stream().skip(1).reduce(first,(a,b)-> a/b);
    }
}
