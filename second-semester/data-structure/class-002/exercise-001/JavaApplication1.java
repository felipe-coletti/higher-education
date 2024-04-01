package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        for (int line = 1; line <= 10; line++) {
            String result = String.valueOf(line);
            
            for (int column = 2 * line; column <= 10 * line; column += line) {
                result += " | " + column;
            }
            
            System.out.println(result);
        }
    }
}
