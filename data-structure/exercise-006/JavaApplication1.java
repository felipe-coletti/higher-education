package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        String[] salaries = {1200, 5000, 7400};
        
        for (int i = 0; i <= salaries.length; i++) {
            salaries[i] += salaries;
            
            System.out.println(salaries);
        }
    }
}
