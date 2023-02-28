package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        
        int number = header.nextInt();
        
        for (int currentLine = 1; currentLine <= number; currentLine++) {
            String result = "";
            
            for (int columnsNeeded = 1; columnsNeeded <= currentLine; columnsNeeded++) {
                result += currentLine + " ";
            }
            
            System.out.println(result);
        }
    }
}
