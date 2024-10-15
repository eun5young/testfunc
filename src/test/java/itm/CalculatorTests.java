package itm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import itm.oss.Calculator;

@DisplayName("Calculator tests for OSS class")
public class CalculatorTests {
    
    private final Calculator calc = new Calculator();
    @Test
    @DisplayName("Test for add function.")
    void add(){
        assertEquals(10,calc.add(5, 5),"Expected value is 10in add function");
    }

    @Test
    @DisplayName("Testing function isPrime.")
    void isfivePrime(){
        assertTrue(calc.isPrime(5), "5 is prime.");
    }

}
