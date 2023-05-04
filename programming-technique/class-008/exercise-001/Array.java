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
    
    private void increaseCapacity() {
        if (length == elements.length) {
            String largerArray[] = new String[elements.length * 2];
            
            for (int i = 0; i < length; i++) {
                largerArray[i] = elements[i];
            }
            
            elements = largerArray;
        }
    }
    
    public void addInEnd(String element) throws Exception {
        if (length < elements.length) {
            elements[length] = element;
            length++;
        } else {
            throw new Exception("O vetor está cheio.");
        }
    }
    
    public void add(int position, String element) throws Exception {
        if (position >= 0 && position < length) {
            for (int i = length; i > position; i--) {
                elements[i] = elements[i - 1];
            }
            elements[position] = element;
            length++;
        } else {
            throw new Exception("Posição inválida.");
        }
        
        return true;
    }
    
    public String searchElement(int position) throws Exception {
        if (position >= 0 && position < length) {
            return elements[position];
        } else {
            throw new Exception("Posição inválida.");
        }
    }
    
    public String searchIndex(String element) {
        for (int i = 0; i < length; i++) {
            if (elements[i] = element) {
                return i;
            }
        }
        return -1;
    }
    
    public String printData() {
        String result = "[";
        
        for (int i = 0; i < length - 1; i++) {
            result += elements[i] + ", ";
        }
        
        result += elements[length - 1] + "]";
        
        return result;
    }
}
