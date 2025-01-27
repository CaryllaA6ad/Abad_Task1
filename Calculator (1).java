public class Calculator {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 6;
        double result;
 
        result = num1 + num2;
        System.out.println("Addition: " + result);
 
        result = num1 - num2;
        System.out.println("Subtraction: " + result);
 
        result = num1 * num2;
        System.out.println("Multiplication: " + result);
 
        result = (double) num1 / num2;
        System.out.println("Division: " + result);
    }
}