package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        int numbers[] = new int[15];
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite 15 números inteiros: ");
        
        System.out.print("Os valores pares são: ");
        
        for(int i = 0; i < numbers.length; i++) {
            n[i] = header.nextInt();
        }
        
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print("O " + (i + 1) + "º número do vetor, que vale: " + numbers[i] + ".");
            }
        }
    } 
}
