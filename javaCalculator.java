import java.beans.JavaBean;
import java.util.Scanner;

public class javaCalculator {

    public static void main(String[] args) {
        calculator Calculator = new calculator();
        Calculator.name = "Math Calculator"; 

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num1 = input.nextInt();
        System.out.println("Please enter a second number:");
        int num2 = input.nextInt();
        System.out.println("Please enter an operator (+, -, *, /, ^)");
        String operator = input.next();
        if (operator.equals("+")) {
            System.out.println(Calculator.name + " calculated " + Calculator.add(num1, num2));
        } else if (operator.equals("-")) {
            System.out.println(Calculator.name + " calculated " + Calculator.substract(num1, num2));
        } else if (operator.equals("*")) {
            System.out.println(Calculator.name + " calculated " + Calculator.multiply(num1, num2));
        } else if (operator.equals("/")) {
            System.out.println(Calculator.name + " calculated " + Calculator.division(num1, num2));
        } else if (operator.equals("^")) {
            System.out.println(Calculator.name + " calculated " + Calculator.Square(num1, num2));
        }
        
        System.out.println("Would you like to use the calculator again?");
        String startover = input.next();
        if (startover.equals("yes")) {
            javaCalculator.main(args);
        } else {
            System.out.println("Thanks for using the calculator!");
        }

        input.close();

        
    }


}
