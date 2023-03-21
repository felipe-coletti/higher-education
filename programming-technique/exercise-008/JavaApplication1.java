package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro de 1 a 4: ");
        int number = header.nextInt();
        
        switch (number) {
            case 1:
                System.out.println("O número que você digitou foi 1.");
                break;
            case 2:
                System.out.println("O número que você digitou foi 2.");
                break;
            case 3:
                System.out.println("O número que você digitou foi 3.");
                break;
            case 4:
                System.out.println("O número que você digitou foi 4.");
                break;
            default:
                System.out.println("O número que você digitou é inválido.");
        }
    }
}
