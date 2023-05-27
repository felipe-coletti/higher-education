package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int a[] = {3, 5, 6, 8, 10};
        int b[] = {2, 3, 4, 5, 6};
        int c[] = new int[5];
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("O " + (i + 1) + "º número do vetor A é: " + a[i] + ".");
        }
        
        for (int i = 0; i < b.length; i++) {
            System.out.println("O " + (i + 1) + "º número do vetor B é: " + b[i] + ".");
            c[i] = a[i] * b[i];
        }
        
        for (int i = 0; i < c.length; i++) {
            System.out.println("O " + (i + 1) + "º número do vetor C é: " + c[i] + ".");
        }
    } 
}
