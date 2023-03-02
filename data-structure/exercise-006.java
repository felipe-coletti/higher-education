package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        String[] salaries = {};
        
        for (int i = 0; i <= salaries.length; i++) {
            salaries[i] += salaries;
            System.out.println(salaries);
        }
    }
}
