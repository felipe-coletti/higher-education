package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
	    
	int number;
	    
	do {
	    System.out.println("Digite um número inteiro entre 15 e 75 para continuar: ");
            number = header.nextInt();
	} while (number >= 15 && number <= 75);
	    
	System.out.println(number + " não é um número entre 15 e 75.");
    } 
}
