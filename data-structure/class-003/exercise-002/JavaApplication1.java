package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        String[] names = {"Ana", "Marcos", "João"};
        String[] invertedNames = new String[names.length];
        int j;
        
        for (int i = names.length - 1; i >= 0; i--) {
            j = names.length - 1 - i;
            invertedNames[j] = names[i];

            System.out.println(invertedNames[j]);
        }
    }
}
