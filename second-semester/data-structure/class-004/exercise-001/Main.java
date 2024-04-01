package javaapplication1;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        
        list.addItem("Ricardo", "958455865");
        list.addItem("Ana", "964582315");
        list.addItem("Aline", "9354784898");
        list.addItem("Ricardo", "956855485");
        
        list.printList();
        
        list.findTelephone("Ana");
        list.findTelephone("Maria");
        list.findTelephone("Ricardo");
    } 
}
