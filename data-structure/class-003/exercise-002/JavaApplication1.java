package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        String[] names, invertedNames = {"Ana", "Marcos", "João"};
        
        for (int i = names.length; i >= 0; i--) {
            for (int j = 0; j <= invertedNames; j++) {
                invertedNames[j] = names[i];
                
                System.out.println(invertedNames[j]);
            }
        }
    }
}
