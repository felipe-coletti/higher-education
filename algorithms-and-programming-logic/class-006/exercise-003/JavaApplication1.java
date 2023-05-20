package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int firstNumber = header.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int secondNumber = header.nextInt();
        
        if (firstNumber < secondNumber) {
            String result = "Os números de " + firstNumber + " a " + secondNumber + " são " + firstNumber;
            
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                result += ", " + i;
            }
            
            result += " e " + secondNumber + ".";
            System.out.println(result);
        }
    } 
}
