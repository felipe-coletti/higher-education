package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int number;
        int result = 0;

        do {
            System.out.println("Digite um número inteiro: ");
            number = leitor.nextInt();
            result += number;
            System.out.println("Soma: " + result);
        } while(number != 0);
    }
}
