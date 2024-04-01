package javaapplication1;

public class Stack {
    Knot top;
    int length;
    
    Stack() {
        top = null;
        length = 0;
    }
    
    boolean isItEmpty() {
        return length == 0;
    }
    
    void toStack(Object info) {
        Knot knot = new Knot(info);
        
        if (!isItEmpty()) {
            knot.pointer = top;
        }
        
        top = knot;
        
        length++;
    }
    
    Object top() {
        if (isItEmpty()) {
            System.out.println("A lista está vazia.");
            
            return null;
        } else {
            return top.info;
        }
    }
    
    Object unstack() {
        if (isItEmpty()) {
            System.out.println("A lista está vazia.");
            
            return null;
        } else {
            Object info = top.info;
            top = top.pointer;
            
            length--;
            
            return info;
        }
    }
}
