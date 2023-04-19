package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        float number = header.nextFloat();
        
        if (number % 2 == 0) {
            System.out.println("O número " + number + " é par.");
        } else {
            System.out.println("O número " + number + " é impar.");
        }
    }
}
