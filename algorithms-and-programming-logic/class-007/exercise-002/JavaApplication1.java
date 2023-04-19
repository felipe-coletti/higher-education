package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
         Scanner header = new Scanner(System.in);
        
        float grades[] = new float[10];
        float approved = 0;
        
        System.out.println("Digite 10 notas: ");
        
        for (int i = 0; i < grades.length; i++) {
            grades[i] = header.nextFloat();
        }
        
        for (int i = 0; i < grades.length; i++) {
            System.out.print("A nota do" + (i + 1) + "º aluno é: " + grades[i] + ".");
            if (i > 7) {
                approved++;
            }
        }
        
        System.out.print("A quantidade de alunos aprovados é: " + approved + ".");
        System.out.print("A quantidade de alunos reprovados é: " + (grades.length - approved) + ".");
    } 
}
