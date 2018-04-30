package org.calculator.factory.impl;

import org.calculator.factory.IOperationFactory;
import org.calculator.model.*;
import org.calculator.util.exception.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class OperationFactory implements IOperationFactory {
    @Override
    public IOperator getOperator(String operation) throws BadRequestException{

        switch (operation){
            case ADD:
                return Add.getInstance();
            case SUB:
                return new Sub();
            case MULT:
                return new Mult();
            case DIV:
                return new Div();
            default:
                throw new BadRequestException("Invalid Operation for param "+operation);

        }


    }
}
