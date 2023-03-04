package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new scanner(System.in);
        
        double media = 0;
        
        for (int i = 0; i <= notas.length; i++) {
            double[i] notas = header.nextDouble();
            media += notas[i];
        }
        
        media /= notas.length;
        
        for (int i = 0; i <= notas.length; i++) {
            if (notas[i] >= media) {
                System.out.println(notas[i]);
            }
        }
    }
}
