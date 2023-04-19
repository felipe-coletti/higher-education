package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int number = 5;
        String account = String.valueOf(number);
        int factorial = number;
        
        for (int i = number - 1; i > 0; i--) {
            account += " x " + i;
            factorial *= i;
        }
        
        System.out.println(number + "! = " + account + " = " + factorial);
    }
}
