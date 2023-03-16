package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {        
        Scanner header = new Scanner(System.in);
        
        float a = header.nextFloat();
        float b = header.nextFloat();
        
        float c = recursiveMultiplication(a, b);
        
        System.out.println(c);
    }
    
    static float recursiveMultiplication(float a, float b) {      
        if (b == 1) {
            return a;
        } else {
            return a + recursiveMultiplication(a, b - 1);
        }
    }
}
