package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite uma temperatura em °F: ");
        float f = header.nextFloat();
        
        float c = (f - 32) * 5/9;
        
        System.out.println(f + " °F equivale a " + c + " °C.");
    }
}
