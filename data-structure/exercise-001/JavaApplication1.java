/*
package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
*/

package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2) {
            if (i % 2 != 0) {
                i++;
            }
            
            System.out.println(i);
        }
    }
}
