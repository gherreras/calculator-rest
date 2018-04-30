package org.calculator.controller.impl;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.calculator.controller.ICalculatorController;
import org.calculator.factory.IOperationFactory;
import org.calculator.util.exception.BadRequestException;
import org.calculator.util.exception.OperationException;
import org.calculator.util.validation.IValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController implements ICalculatorController {

    @Autowired
    private IOperationFactory iOperationFactory;
    @Autowired
    private IValidator validator;

    @RequestMapping("/api/v1/calculator/{operation}/**")
    public double operation(@PathVariable("operation") String operation,
                             HttpServletRequest request) throws BadRequestException, OperationException {

        String urlTail = (String) new AntPathMatcher()
                                        .extractPathWithinPattern("/api/v1/calculator/{operation}/**"
                                                                            ,request.getRequestURI());

        return iOperationFactory.getOperator(operation)
                                            .execute(validator.validateInput(urlTail));

    }
}
