package javaapplication1;
public class exercise-005 {
    public static void main(String[] args) {
        int a[] = {3, 5, 6, 8, 10};
        int b[] = {3, 5, 6, 8, 10};
        int c[] = new int[5];
        
        for(int i = 0; i < a.length; i++) {
            System.out.print("O " + (i + 1) + "º número do vetor A é: " + a[i] + ".");
        }
        
        for(int i = 0; i < a.length; i++) {
            System.out.print("O " + (i + 1) + "º número do vetor B é: " + b[i] + ".");
        }
        
        for(int i = 0; i < a.length; i++) {
            c[i] = (a[i] * b[i]);
            System.out.print("O " + (i + 1) + "º número do vetor C é: " + c[i] + ".");
        }
    } 
}
