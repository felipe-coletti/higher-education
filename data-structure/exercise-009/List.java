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
        Knot n = new Knot(info);
    }
}
