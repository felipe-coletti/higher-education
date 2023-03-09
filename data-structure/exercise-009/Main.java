package javaapplication1;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add("Ricardo", "123456789");
        list.add("Ricardo", "987654321");
        list.printList();
        list.findTelephone("Ricardo");
    } 
}
