package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite 10 números inteiros: ");
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = header.nextInt();
        }
        
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = numbers[i] * 10;
            } else {
                numbers[i] = numbers[i] + 5;
            }
            
            System.out.print("O " + (i + 1) + "º número é: " + numbers[i] + ".");
        }
    } 
}
