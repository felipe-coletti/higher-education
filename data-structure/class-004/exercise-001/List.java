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
    
    boolean isItEmpty() {
        return length == 0;
    }
    
    void addItem(String name, String telephone) {
        Knot knot = new Knot(name, telephone);
        
        if (isItEmpty()) {
            start = knot;
        } else {
            end.next = knot;
        }
        
        end = knot;
        length++;
    }
    
    void printList() {
        Knot knot = start;
        
        for (int i = 0; i < length; i++) {
            System.out.println(knot.name + ": " + knot.telephone);
            
            knot = knot.next;
        }
    }
    
    void findTelephone(String name) {
        Knot knot = start;
        
        int equalsQuantity = 0;
        
        for (int i = 0; i < length; i++) {
            if (knot.name.equals(name)) {
                System.out.println(knot.telephone);
                
                equalsQuantity++;
            }
            knot = knot.next;
        }
        if (equalsQuantity == 0) {
            System.out.println("Não existe nenhum telefone cadastrado com esse nome.");
        }
    }
}
