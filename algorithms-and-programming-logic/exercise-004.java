package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        float numeros[] = {3, 5, 6, 8, 10};
        float soma = 0;
        
        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                soma += numeros[i];
            }
            
            System.out.print("A soma dos números impares é: " + soma + ".");
        }
    } 
}
