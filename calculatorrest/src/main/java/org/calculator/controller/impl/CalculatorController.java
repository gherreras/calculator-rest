package org.calculator.controller.impl;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.calculator.controller.ICalculatorController;
import org.calculator.factory.IOperationFactory;
import org.calculator.util.IValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


@RestController
public class CalculatorController implements ICalculatorController {

    @Autowired
    private IOperationFactory iOperationFactory;
    @Autowired
    private IValidator validator;

    @RequestMapping("/calculator/{operation}/**")
    public double operation(@PathVariable("operation") String operation,
                             HttpServletRequest request) {

        String urlTail = (String) new AntPathMatcher()
                                        .extractPathWithinPattern("/calculator/{operation}/**"
                                                                            ,request.getRequestURI());

        return iOperationFactory.getOperator(operation)
                                            .execute(validator.validateInput(urlTail));

    }
}
