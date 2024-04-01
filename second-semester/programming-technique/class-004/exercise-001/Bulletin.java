package javaapplication1;

import javax.swing.JOptionPane;

public class Bulletin {
    double firstGrade, secondGrade, average;
    String concept;
    
    public Bulletin(double firstGrade, double secondGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.average = (firstGrade + secondGrade) / 2;
        this.concept = verifyConcept();
    }
    
    public String verifyConcept() {        
        if (average >= 9) {
            return "A";
        } else if (average >= 7) {
            return "B";
        } else if (average >= 5) {
            return "C";
        } else if (average >= 4.5) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public void printData() {
        JOptionPane.showMessageDialog(null, "Dados do boletim:\nNota 1: " + firstGrade + "\nNota 2: " + secondGrade + "\nMédia: " + average + "\nConceito: " + concept);
    }
}
