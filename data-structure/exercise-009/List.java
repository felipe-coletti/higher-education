package javaapplication1;

public class List {
    Knot start;
    Knot end;
    int length;
    
    List() {
        start = null;
        end = null;
        length = 0;
    }
    
    void add(Object info) {
        Knot knot = new Knot(info);
        
        if (length == 0) {
            start = knot;
        } else {
            end.next = knot;
        }
        
        end = knot;
        length++;
    }
    
    boolean isItEmpty() {
        return length == 0;
    }
    
    void printList() {
        Knot knot = start;
        for (int i = 0; i < length; i++) {
            System.out.println(knot.info);
            knot = knot.next;
        }
    }
}
