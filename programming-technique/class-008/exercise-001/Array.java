package javaapplication1;

import java.util.Arrays;

public class Array {
    private final String[] elements;
    private int length;
    
    public Array(int length) {
        this.elements = new String[length];
        this.length = 0;
    }
    
    public void add(String element) throws Exception {
        if (length < elements.length) {
            elements[length] = element;
            length++;
        } else {
            throw new Exception("O vetor está cheio.");
        }
    }
    
    public int getLength() {
        return length;
    }
    
    public void printData() {
        System.out.println(Arrays.toString(elements));
    }
}
