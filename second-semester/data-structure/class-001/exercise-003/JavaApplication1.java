package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        int number;
        int sum = 0;

        do {
            System.out.println("Digite um número inteiro: ");
            number = header.nextInt();
            
            sum += number;
            
            System.out.println("A soma é: " + sum + ".");
        } while(number != 0);
    }
}
