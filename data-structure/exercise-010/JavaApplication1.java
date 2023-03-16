package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {        
        Scanner header = new Scanner(System.in);
        
        float a = header.nextFloat();
        float b = header.nextFloat();
        
        float c = multiplication(a, b);
        
        System.out.println(c);
    }
    
    static float multiplication(float a, float b) {
        for (int i = 0; i < b; i++) {
            float c += a;
        }
        
        return c;
    }
}
