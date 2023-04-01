package Calculator_HW;
import java.util.Scanner;
import static Calculator_HW.CalcUtils.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        System.out.println("Hello! Enter your name!");
        String name = scanner.next();
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2= scanner.nextDouble();
        System.out.println("Enter function that you need");
        char function = scanner.next().charAt(0);
        switch (function){
            case '+':
                result = sum (num1,num2);
                break;
            case '-':
                result = sub (num1,num2);
                break;
            case '*':
                result = mult (num1,num2);
                break;
            case '/':
                result = div (num1,num2);
                break;
            case '%':
                result= per (num1,num2);
                break;
            default:
                System.out.println("Entering error");
                System.exit(0);
                break;
        }
        System.out.println(name + ", "+ "your result = " + result);
    }
}
