package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        float grades[] = new float[9];
        
        System.out.println("Digite 10 notas: ");
        
        for (int i = 0; i < grades.length; i++) {
            grades[i] = header.nextFloat();
        }
        
        for (int i = 0; i < grades.length; i++) {
            if (i == 7 || i == 9) {
                System.out.print("A " + (i + 1) + "º nota é: " + grades[i] + ".");
            }
        }
    }
}
