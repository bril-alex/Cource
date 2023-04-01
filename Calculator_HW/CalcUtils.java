package Calculator_HW;

public class CalcUtils {
    public static double sum (double num1, double num2){
        return num1 + num2;
    }
    public static double sub (double num1, double num2){
        return num1 - num2;
    }
    public static double mult (double num1, double num2){
        return num1 * num2;
    }
    public static double div (double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division is impossible");
            System.exit(0);
        }
        return num1 / num2;
    }
    public static double per (double num1, double num2){
        return (num1 /num2) *100 ;
    }
}
