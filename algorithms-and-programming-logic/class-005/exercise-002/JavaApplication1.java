package javaapplication1;

import java.util.Scanner;

import java.lang.Float;

public class JavaApplication1 {
    public static void main(String[] args) {
	Scanner header = new Scanner(System.in);

	System.out.println("Digite o valor de a: ");
        float a = header.nextFloat();
        System.out.println("Digite o valor de b: ");
        float b = header.nextFloat();
        System.out.println("Digite o valor de c: ");
        float c = header.nextFloat();

        if (a < b + c && b < a + c && c < a + b) {
	    if (Float.compare(a, b) == 0 && Float.compare(b, c) == 0) {
                System.out.println("Os segmentos de reta a, b e c podem formar um triângulo equilátero.");
	    } else if (Float.compare(a, b) != 0 && Float.compare(b, c) != 0) {
                System.out.println("Os segmentos de reta a, b e c podem formar um triângulo escaleno.");
	    } else {
	        System.out.println("Os segmentos de reta a, b e c podem formar um triângulo isóceles.");
	    }
        } else {
	    System.out.println("Os segmentos de reta a, b e c não podem formar um triângulo.");
        }
    }
}
