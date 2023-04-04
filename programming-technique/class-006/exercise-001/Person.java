package javaapplication1;

import javax.swing.JOptionPane;

public class Person {
    private String name;
    private String telephone;

    public Person(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public void printData() {
        JOptionPane.showMessageDialog(null, "Dados da pessoa:\nNome: " + name + "\nTelefone: " + telephone);
    }
}
