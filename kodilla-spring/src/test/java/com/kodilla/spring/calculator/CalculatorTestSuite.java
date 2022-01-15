package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Display.class)
public class CalculatorTestSuite {

    @Test
    void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2,2);
        double div = calculator.div(4,2);
        double sub = calculator.sub(4,2);
        double mul = calculator.mul(4,5);
        //Then
        assertEquals(4,add);
        assertEquals(2,div);
        assertEquals(2,sub);
        assertEquals(20,mul);
    }
}
