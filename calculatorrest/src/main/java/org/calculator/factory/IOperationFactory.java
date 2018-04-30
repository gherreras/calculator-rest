package org.calculator.factory;


import org.calculator.model.IOperator;
import org.calculator.util.exception.BadRequestException;

public interface IOperationFactory {

    public static final String ADD = "add";
    public static final String SUB = "subs";
    public static final String MULT = "mult";
    public static final String DIV = "div";
    public IOperator getOperator (String operation) throws BadRequestException;

}
