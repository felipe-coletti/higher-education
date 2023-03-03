package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        float notas[] = new float[9];
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite as 10 notas: ");
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = header.nextFloat();
        }
        
        for(int i = 0; i < notas.length; i++) {
            if (i == 6 || i == 8) {
                System.out.print("A " + (i + 1) + "º nota é: " + notas[i] + ".");
            }
        }
    }
}
