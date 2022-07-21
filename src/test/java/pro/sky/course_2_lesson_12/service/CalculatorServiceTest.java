package pro.sky.course_2_lesson_12.service;

import org.junit.jupiter.api.Test;
import pro.sky.course_2_lesson_12.exception.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.course_2_lesson_12.constants.ConstantsTest.*;

class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorService();

    @Test
    public void shouldReturnThreeWhenOnePlusTwo() {
        assertEquals(THREE, out.plus(ONE, TWO));
    }

    @Test
    public void shouldReturnMinusThreeWhenMinusOnePlusMinusTwo() {
        assertEquals(MINUS_THREE, out.plus(MINUS_ONE, MINUS_TWO));
    }

    @Test
    public void shouldReturnOneWhenThreeMinusTwo() {
        assertEquals(ONE, out.minus(THREE, TWO));
    }

    @Test
    public void shouldReturnMinusOneWhenTwoMinusThree() {
        assertEquals(MINUS_ONE, out.minus(TWO, THREE));
    }

    @Test
    public void shouldReturnTwoWhenOneMultiplyTwo() {
        assertEquals(TWO, out.multiply(ONE, TWO));
    }

    @Test
    public void shouldReturnMinusTwoWhenTwoMultiplyMinusOne() {
        assertEquals(MINUS_TWO, out.multiply(TWO, MINUS_ONE));
    }

    @Test
    public void shouldReturnMinusTwoWhenMinusFourDivideTwo() {
        assertEquals(MINUS_TWO, out.divide(MINUS_FOUR, TWO));
    }

    @Test
    public void shouldReturnZeroWhenZeroDivideFour() {
        assertEquals(ZERO, out.divide(ZERO, FOUR));
    }

    @Test
    public void shouldReturnDivideByZeroExceptionWhenOneDivideZero() {
        assertThrows(DivideByZeroException.class,
                () -> out.divide(ONE, ZERO), "Calculation error! Деление на 0 не возможно");
    }

    @Test
    public void shouldReturnDivideByZeroExceptionWhenMinusOneDivideZero() {
        assertThrows(DivideByZeroException.class,
                () -> out.divide(MINUS_ONE, ZERO), "Calculation error! Деление на 0 не возможно");
    }
}