package org.calculator.util.validation.impl;

import org.calculator.util.exception.BadRequestException;
import org.calculator.util.validation.IValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Validator implements IValidator {
    @Override
    public List<Double> validateInput(String input) throws BadRequestException {
        try{
            return  Stream.of(input.split("/"))
                    .map(number -> Double.parseDouble(number))
                    .collect(Collectors.toList());
        }catch(Exception e){
            throw new BadRequestException("Invalid Params "+e.getMessage());
        }

    }
}
