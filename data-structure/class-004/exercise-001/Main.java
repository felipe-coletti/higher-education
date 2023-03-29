package javaapplication1;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        
        list.add("Ricardo", "958455865");
        list.add("Ana", "964582315");
        list.add("Aline", "9354784898");
        list.add("Ricardo", "956855485");
        
        list.printList();
        
        list.findTelephone("Ana");
        list.findTelephone("Maria");
        list.findTelephone("Ricardo");
    } 
}
