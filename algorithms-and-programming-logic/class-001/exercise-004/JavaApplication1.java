package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite o valor da base do retângulo: ");
        float b = header.nextFloat();
        System.out.println("Digite o valor da altura do retângulo: ");
        float h = header.nextFloat();
        
        float a = b * h;
        
        System.out.println("A área do retângulo é: " + a + ".");
    }
}
