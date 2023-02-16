package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        float numbers[] = {3, 5, 6, 8, 10};
        float sum = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
            
            System.out.print("A soma dos números impares é: " + sum + ".");
        }
    } 
}
