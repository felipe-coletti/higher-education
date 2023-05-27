package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        int i = 0;
        
        while (i <= 2) {
            System.out.println("Digite a primeira nota: ");
            float firstGrade = header.nextFloat();
            System.out.println("Digite a segunda nota: ");
            float secondGrade = header.nextFloat();
            System.out.println("Digite a terceira nota: ");
            float thirdGrade = header.nextFloat();
            
            float average = (firstGrade + secondGrade + thirdGrade) / 3;
            
            System.out.println("A média das notas do " + (i + 1) + "º aluno é: " + average + ".");
            
            i++;
        }
    }
}
