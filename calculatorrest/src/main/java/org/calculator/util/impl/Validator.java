package org.calculator.util.impl;

import org.calculator.util.IValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Validator implements IValidator {
    @Override
    public List<Double> validateInput(String input) {

        return  Stream.of(input.split("/"))
                .map(number -> Double.parseDouble(number))
                .collect(Collectors.toList());
    }
}
