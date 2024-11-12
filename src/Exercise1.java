import myClass.*;

public class Exercise1 {
    public static void main(String[] args) {
        int result;

        result = Calculator.calculate(5,6,Calculator.ADDITION);
        System.out.println(result);
        result = Calculator.calculate(5,10,Calculator.SUBTRACTION);
        System.out.println(result);
        result = Calculator.calculate(3,2,Calculator.MULTIPLICATION);
        System.out.println(result);
        result = Calculator.calculate(15,2,Calculator.DIVISION);
        System.out.println(result);
    }
}
