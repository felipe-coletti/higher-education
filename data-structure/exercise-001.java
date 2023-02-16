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
        int i = 1;
        
        if (i % 2 != 0) {
            i++;
        }
        
        for (i = i; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
