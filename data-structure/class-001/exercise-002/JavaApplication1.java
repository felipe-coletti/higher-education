package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int number = 5;
        int result = number;
        String count = String.valueOf(number);
        
        for (int i = number - 1; i > 0; i--) {
            count += " x " + i;
            result *= i;
        }
        
        System.out.println(number + "! = " + count + " = " + result);
    }
}
