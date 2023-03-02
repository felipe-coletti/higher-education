package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        String[] names, invertedNames = {"João", "Marcos", "Ana"};
        
        for (int i = names.length; i >= 0; i--) {
            for (int j = 0; j <= invertedNames; j++) {
                invertedNames[j] = names[i];
                System.out.println(invertedNames[j]);
            }
        }
    }
}
