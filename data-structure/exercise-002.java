package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int number = 6;
        int result;
        
        for (int i = number - 1; i >= 1; i--) {
            result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
