package javaapplication1;
import java.util.Scanner;
public class exercise-006 {
    public static void main(String[] args) {
        int e[] = new int[15];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite 15 números inteiros: ");
        
        System.out.print("Os valores pares são: ");
        
        for(int i = 0; i < e.length; i++) {
            n[i] = in.nextInt();
        }
        
        for(int i = 0; i < e.length; i++) {
            if (e[i] % 2 == 0) {
                System.out.print("O " + (i + 1) + "º elemento do vetor, que vale: " + e[i] + ".");
            }
        }
    } 
}
