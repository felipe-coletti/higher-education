package javaapplication1;

public class Array {
    private final String[] elements;
    private int length;
    
    public Array(int length) {
        this.elements = new String[length];
        this.length = 0;
    }
    
    public int getLength() {
        return length;
    }
    
    public void add(String element) throws Exception {
        if (length < elements.length) {
            elements[length] = element;
            length++;
        } else {
            throw new Exception("O vetor está cheio.");
        }
    }
    
    public String printData() {
        String result = "["
        
        for (int i = 0; i < length - 1; i++) {
            result += elements[i] + ", ";
        }
        
        result += elements[length - 1] + "]"
        
        return result
    }
}
