import exception.MyBiggestDivideException;
import exception.MyDivideByZeroException;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 100;

        //System.out.println(calculate(n1, n2));
        System.out.println(calculate(n1, 0));
    }

    private static int calculate (int n1, int n2) {
        int result;
        if (n2 > n1) {
            throw new MyBiggestDivideException("Второе число не должно быть больше первого!");
        }
        try {
            result = n1 / n2;
        } catch (ArithmeticException e) {
            throw new MyDivideByZeroException("Деление на нуль!!!");
        }
        return result;
    }
}
