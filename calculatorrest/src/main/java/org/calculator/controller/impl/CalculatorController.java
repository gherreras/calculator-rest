package org.calculator.controller.impl;

import org.calculator.controller.ICalculatorController;
import org.calculator.factory.IOperationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController implements ICalculatorController {

    @Autowired
    private IOperationFactory iOperationFactory;

    @Override
    @RequestMapping("/calculator/{operation}/{num1}/{num2}")
    public long operation(@PathVariable("operation") String operation,
                          @PathVariable("num1") int num1,
                          @PathVariable("num2")int num2) {
        return iOperationFactory.getOperator(operation).execute(num1,num2);
    }
}
