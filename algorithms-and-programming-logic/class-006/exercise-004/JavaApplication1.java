package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        float price = 80;
        int years = 1;
        
        for (float i = price; i <= 5000; i *= 2) {
            years++;
        }
        
        System.out.println("O preço de prestação será maior que R$ 5000,00 em " + years + " anos.");
    }
}
