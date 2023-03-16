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
            return "The stack is empty.";
        } else {
            return top.info;
        }
    }
    
    void unstack() {
        if (isItEmpty()) {
            return "The stack is empty.";
        } else {
            Knot knot = top;

            for (int i = 0; i < length; i++) {
                System.out.println(knot.info);
                knot = knot.pointer;
            }
        }
    }
}
