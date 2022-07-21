package pro.sky.course_2_lesson_12.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParametrizedTest {

    CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("paramsForPlus")
    public void plusTest(float expected,
                         float a,
                         float b) {
        assertEquals(expected, out.plus(a, b));
    }

    @ParameterizedTest
    @MethodSource("paramsForMinus")
    public void minusTest(float expected,
                          float a,
                          float b) {
        assertEquals(expected, out.minus(a, b));
    }

    @ParameterizedTest
    @MethodSource("paramsForMultiply")
    public void multiplyTest(float expected,
                             float a,
                             float b) {
        assertEquals(expected, out.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("paramsForDivide")
    public void divideTest(double expected,
                           float a,
                           float b) {
        assertEquals(expected, out.divide(a, b));
    }


    public static Stream<Arguments> paramsForPlus() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(1, -3, 4),
                Arguments.of(4, 4, 0),
                Arguments.of(3, 0, 3)
        );
    }

    public static Stream<Arguments> paramsForMinus() {
        return Stream.of(
                Arguments.of(1, 3, 2),
                Arguments.of(-7, -3, 4),
                Arguments.of(4, 4, 0),
                Arguments.of(-3, 0, 3)
        );
    }

    public static Stream<Arguments> paramsForMultiply() {
        return Stream.of(
                Arguments.of(6, 3, 2),
                Arguments.of(-12, -3, 4),
                Arguments.of(0, 4, 0),
                Arguments.of(-6, 2, -3)
        );
    }

    public static Stream<Arguments> paramsForDivide() {
        return Stream.of(
                Arguments.of(1.5, 3, 2),
                Arguments.of(-3, -12, 4),
                Arguments.of(0, 0, 5),
                Arguments.of(3, 9, 3)
        );
    }
}
