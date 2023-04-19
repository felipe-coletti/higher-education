package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int number = 5;
        int result = number;
        
        for (int i = number - 1; i > 1; i--) {
            result *= i;
            
            System.out.println(result / i + " x " + i + " = " + result);
        }
    }
}
