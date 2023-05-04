package javaapplication1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(5);
        
        try {
            array.addInEnd("Primeiro elemento");
            array.addInEnd("Segundo elemento");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        
        System.out.println(array.add(0, "Primeiro elemento"));
        
        System.out.println(array.getLength());
        
        System.out.println(array.searchElement(0));
        
        System.out.println(array.searchIndex("Primeiro elemento"));
        
        System.out.println(array.printData());
    }
}
