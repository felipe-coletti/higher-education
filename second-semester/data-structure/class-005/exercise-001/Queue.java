package javaapplication1;

public class Queue {
    Knot start;
    Knot end;
    int length;
    
    Queue() {
        start = null;
        end = null;
        length = 0;
    }
    
    boolean isItEmpty() {
        return length == 0;
    }
    
    void toQueue(Object info) {
        Knot knot = new Knot(info);
        
        if (isItEmpty()) {
            start = knot;
        } else {
            end.next = knot;
        }
        
        end = knot;
        
        length++;
    }
    
    Object start() {
        if (isItEmpty()) {
            System.out.println("A fila está vazia.");
            
            return null;
        } else {
            return start.info;
        }
    }
    
    Object unqueue() {
        if (isItEmpty()) {
            System.out.println("A fila está vazia.");
            
            return null;
        } else {
            Object info = start.info;
            start = start.next;
            
            length--;
            
            return info;
        }
    }
    
    String printQueue() {
        Knot knot = start;
        
        String task = "";
        
        for (int i = 0; i < length; i++) {
            task += knot.info + "\n";
            
            knot = knot.next;
        }
        
        return task;
    }
}
