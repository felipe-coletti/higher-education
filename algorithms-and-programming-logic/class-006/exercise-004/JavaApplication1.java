package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        float value = 80;
        int years = 1;
        
        for (float i = value; i <= 5000; i *= 2) {
            years++;
        }
        
        System.out.println("O valor de prestação será maior que R$ 5000,00 em " + years + " anos.");
    }
}
