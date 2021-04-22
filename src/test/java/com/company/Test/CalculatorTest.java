package com.company.Test;

import com.company.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();
    public void Testadd(){
        int a = 3;
        int b=3;
        int expected = 5;
        int c = calculator.add(a,b);
        assertEquals(expected,c);
    }
}
 