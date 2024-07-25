package gr.aueb.cf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addTwoIntegers() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;
        int actualResult = 0;
        int expectedResult = 30;

        actualResult = calculator.add(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void subTwoIntegers() {
        Calculator calculator = new Calculator();
        int a = 30;
        int b = 20;
        int actualResult = 0;
        int expectedResult = 10;

        actualResult = calculator.sub(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divPositiveScenario() throws Exception {
        Calculator calculator = new Calculator();
        int a = 30;
        int b = 10;
        int actualResult = 0;
        int expectedResult = 3;

        actualResult = calculator.div(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divNegativeScenario()  {
        Calculator calculator = new Calculator();
        int a = 30;
        int b = 0;

        Assertions.assertThrows(Exception.class, () -> {
            calculator.div(a, b);
        });
    }
}