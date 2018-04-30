package org.calculator.model;


import org.calculator.util.exception.OperationException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class DivTest {

    @Test
    public void validateDivOperation() throws OperationException {
        IOperator div = new Div();
        List<Double> list = new ArrayList<>();
        list.add(Double.valueOf(4));
        list.add(Double.valueOf(2));
        double result = div.execute(list);
        assertEquals("Incorrect",Double.valueOf(2),result);
    }

    @Test
    public void validateDivOperationFirstZero() throws OperationException {
        IOperator div = new Div();
        List<Double> list = new ArrayList<>();
        list.add(Double.valueOf(0));
        list.add(Double.valueOf(2));
        double result = div.execute(list);
        assertEquals("Incorrect",Double.valueOf(0),result);
    }

    @Test(expected = OperationException.class)
    public void validateDivOperationByZero() throws OperationException {
        IOperator div = new Div();
        List<Double> list = new ArrayList<>();
        list.add(Double.valueOf(4));
        list.add(Double.valueOf(0));
        double result = div.execute(list);
    }

}
