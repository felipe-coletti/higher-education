
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        float grades[] = new float[3];
        float average = 0;
        
        System.out.println("Digite 3 notas: ");
        
        for(int i = 0; i < grades.length; i++) {
            grades[i] = header.nextFloat();
            
            average += grades[i];
        }
        
        average /= grades.length;
        
        if (average >= 7) {
            System.out.println("O aluno foi aprovado com a média: " + average + ".");
        } else {
            System.out.println("O aluno foi reprovado com a média: " + average + ".");
        }
        
    }
}
