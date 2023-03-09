package javaapplication1;

public class Knot {
    String name;
    String telephone;
    Knot next;
    
    Knot(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
        next = null;
    }
}
