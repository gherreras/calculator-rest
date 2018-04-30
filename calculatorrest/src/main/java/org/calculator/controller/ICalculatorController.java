package org.calculator.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.calculator.util.exception.BadRequestException;
import org.calculator.util.exception.OperationException;

public interface ICalculatorController {

    public double operation (String operation , HttpServletRequest request) throws BadRequestException, OperationException;

}
