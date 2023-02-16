package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        float n[] = new float[9];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as 10 notas: ");
        
        for(int i = 0; i < n.length; i++) {
            n[i] = in.nextFloat();
        }
        
        for(int i = 0; i < n.length; i++) {
            if (i == 6 || i == 8) {
                System.out.print("A " + (i + 1) + "º nota é " + n[i] + ".");
            }
        }
    }
}
