package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        for (int line = 1; line <= 10; line++) {
            String result = "";
            for (int column = 1 * line; column <= 10 * line; column += line) {
                result += (column + " | ");
            }
            System.out.println(result);
        }
    }
}
