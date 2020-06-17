package ge.cse.junit.demo;

import ge.cse.junit.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void additionTest() {
        int excepted = 112;
        int actual;
        actual = calculatorService.addition(10, 2);
        assertEquals(excepted, actual);
    }


    @Test
    void subtractionTest() {
        int excepted = 8;
        int actual;
        actual = calculatorService.subtraction(10, 2);
        assertEquals(excepted, actual);
    }

    @Test
    void multiplicationTest(){
        int excepted = 20;
        int actual;
        actual = calculatorService.multiplication(10, 2);
        assertEquals(excepted, actual);
    }

    @Test
    void divisionTest(){
        int excepted = 5;
        double actual;
        actual = calculatorService.division(10, 2);
        assertEquals(excepted, actual);
    }
}
