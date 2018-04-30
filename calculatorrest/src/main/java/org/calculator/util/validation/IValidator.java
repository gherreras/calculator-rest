package org.calculator.util.validation;

import org.calculator.util.exception.BadRequestException;

import java.util.List;

public interface IValidator {
    public List<Double> validateInput(String input) throws BadRequestException;
}
