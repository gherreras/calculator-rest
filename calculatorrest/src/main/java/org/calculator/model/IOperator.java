package org.calculator.model;

import org.calculator.util.exception.OperationException;
import java.util.List;

public interface IOperator {

    public double execute (List<Double> list) throws OperationException;
}
