package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        float notas[] = new float[10];
        float aprovados = 0;
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite as 10 notas: ");
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = header.nextFloat();
        }
        
        for(int i = 0; i < notas.length; i++) {
            System.out.print("A nota do" + (i + 1) + "º aluno é: " + notas[i] + ".");
            if (i > 7) {
                aprovados++;
            }
        }
        
        System.out.print("A quantidade de alunos aprovados é: " + aprovados + ".");
        System.out.print("A quantidade de alunos reprovados é: " + (notas.length - aprovados) + ".");
    } 
}
