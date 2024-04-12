package seminar3.Task3;

public class DivByZero extends ArithmeticException{
    public DivByZero () {
        super("Деление на 0");
    }
}
