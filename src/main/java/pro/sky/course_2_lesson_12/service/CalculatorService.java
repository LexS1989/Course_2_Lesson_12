package pro.sky.course_2_lesson_12.service;

import org.springframework.stereotype.Service;
import pro.sky.course_2_lesson_12.exception.DivideByZeroException;

@Service
public class CalculatorService {

    public float plus(float a, float b) {
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            throw new DivideByZeroException("Calculation error! Деление на 0 не возможно");
        }
        return a / b;
    }
}
