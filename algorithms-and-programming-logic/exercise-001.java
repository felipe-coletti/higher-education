package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        float n[] = new float[10];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as 10 notas: ");
        
        for(int i = 0; i < n.length; i++) {
            n[i] = in.nextFloat();
            
            if (i == 7 || i == 9) {
                System.out.print("A " + (i + 1) + "º nota é " + n[i] + ".");
            }
        }
    }
}
