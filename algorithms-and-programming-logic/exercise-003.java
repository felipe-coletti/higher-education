package javaapplication1;
import java.util.Scanner;
public class exercise-003 {
    public static void main(String[] args) {
        int n[] = new int[10];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite 10 números inteiros: ");
        
        for(int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
            
            if (n[i] % 2 == 0) {
                n[i] = n[i] * 10;
            } else {
                n[i] = n[i] + 5;
            }
            
            System.out.print("O " + (i + 1) + "º número é: " + n[i] + ".");
        }
    } 
}
