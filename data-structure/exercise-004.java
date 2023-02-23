package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        String result = null;
        
        for (int line = 1; line <= 10; line++) {
            for (int column = 1; column <= 10; column += line) {
                result += (column + " | ");
            }
            System.out.println(result);
        }
    }
}
