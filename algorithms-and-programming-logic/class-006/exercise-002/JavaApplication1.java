package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int j = 0;
        
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println("O " + (j + 1) + "º multiplo de 5 maior do que 0 é: " + i);
                j++;
            }
        }
    }
}
