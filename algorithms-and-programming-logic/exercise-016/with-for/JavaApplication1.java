package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite a primeira nota: ");
            double firstGrade = header.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double secondGrade = header.nextDouble();
            System.out.println("Digite a terceira nota: ");
            double thirdGrade = header.nextDouble();
            
            double average = (firstGrade + secondGrade + thirdGrade) / 3;
            
            System.out.println("A média das notas do " + (i + 1) + "º aluno é: " + average + ".");
        }
    }
}
