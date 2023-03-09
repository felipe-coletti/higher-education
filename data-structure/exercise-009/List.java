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
    }
}
