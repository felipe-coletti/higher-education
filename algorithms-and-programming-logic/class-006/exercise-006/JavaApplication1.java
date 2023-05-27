package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        float ages[] = new float[10];
        int votersNumber = 0;
        float average = 0;
        
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Digite a idade do " + (i + 1) + "º aluno: ");
            ages[i] = header.nextFloat();
            
            if (ages[i] >= 16) {
                votersNumber++;
            } else {
                average += ages[i];
            }
        }
        
        average /= ages.length - votersNumber;
        
        System.out.println(votersNumber + " alunos podem ser eleitores.");
        System.out.println("A média de idade dos alunos que não podem ser eleitores é de: " + average + " anos.");
    }
}
