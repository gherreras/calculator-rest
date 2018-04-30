package org.calculator.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public interface ICalculatorController {

    public double operation (String operation , HttpServletRequest request);

}
