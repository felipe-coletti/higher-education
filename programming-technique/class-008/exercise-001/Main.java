package javaapplication1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(5);
        
        try {
            array.add("Primeiro elemento");
            array.add("Segundo elemento");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        
        System.out.println(array.getLength());
        
        System.out.println(array.searchElement(0));
        
        System.out.println(array.searchIndex("Primeiro elemento"));
        
        System.out.println(array.printData());
    }
}
