package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        float salaries[] = {1200, 5000, 7400};
        
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] += 200;
            
            System.out.println(salaries[i]);
        }
    }
}
