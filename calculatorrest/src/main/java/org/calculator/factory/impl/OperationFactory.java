package org.calculator.factory.impl;

import org.calculator.factory.IOperationFactory;
import org.calculator.model.*;
import org.springframework.stereotype.Service;

@Service
public class OperationFactory implements IOperationFactory {
    @Override
    public IOperator getOperator(String operation) {

        switch (operation){
            case ADD:
                return new Add();
            case SUB:
                return new Sub();
            case MULT:
                return new Mult();
            case DIV:
                return new Div();

        }

        return null;
    }
}
