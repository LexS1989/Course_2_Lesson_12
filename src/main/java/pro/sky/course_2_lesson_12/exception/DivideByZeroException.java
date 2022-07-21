package pro.sky.course_2_lesson_12.exception;

public class DivideByZeroException extends IllegalArgumentException {

    public DivideByZeroException(String messege) {
        super(messege);
    }
}
