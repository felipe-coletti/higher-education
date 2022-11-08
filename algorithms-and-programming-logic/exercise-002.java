package javaapplication1;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        float n[] = new float[10];
        float a = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as 10 notas: ");
        
        for(int i = 0; i < n.length; i++) {
            n[i] = in.nextFloat();
            
            System.out.print("A nota do" + (i + 1) + "º aluno é: " + n[i] + ".");
            if (i > 7) {
                a++;
            }
        }
        
        System.out.print("A quantidade de alunos aprovados é: " + a + ".");
        System.out.print("A quantidade de alunos reprovados é: " + (n.length - a) + ".");
    } 
}
