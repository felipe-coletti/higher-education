package javaapplication1;

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
        
        array.printData();
    }
}
