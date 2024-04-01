package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        int numbers[] = new int[15];
        
        System.out.println("Digite 15 números inteiros: ");
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = header.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("O " + (i + 1) + "º número é par e vale: " + numbers[i] + ".");
            }
        }
    } 
}
