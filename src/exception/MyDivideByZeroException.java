package exception;

public class MyDivideByZeroException extends ArithmeticException {
    public MyDivideByZeroException(String s) {
        super(s);
    }

    public MyDivideByZeroException() {
    }
}
