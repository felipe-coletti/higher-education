package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite o raio do círculo como um número inteiro: ");
        int r = header.nextInt();
        
        double v = 3.14 * Math.pow(r, 3);
        
        System.out.println("O volume do círculo é: " + v + ".");
    }
}
