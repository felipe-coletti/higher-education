package javaapplication1;

import javax.swing.JOptionPane;

public class Participant {
    String name, category;
    int age;
  
    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
        this.category = verifyCategory();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
  
    String verifyCategory() {        
        if (age >= 30) {
            return "Adulto";
        } else if (age >= 16) {
            return "Jovem adulto";
        } else if (age >= 11) {
            return "Adolescente";
        } else if (age >= 8) {
            return "Juvenil";
        } else if (age >= 5) {
            return "Infantil";
        } else {
            return "Idade inválida.";
        }
    }
  
    void printData() {
        JOptionPane.showMessageDialog(null, "Dados do participante:\nNome: " + name + "\nIdade: " + age + "\nCategoria: " + category);
    }
}
