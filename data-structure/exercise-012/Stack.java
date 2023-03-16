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
    
    void pile(Object info) {
        Knot knot = new Knot(info);
        
        if (!isItEmpty()) {
            knot.pointer = top;
        }
        
        top = knot;
        length++;
    }
}
