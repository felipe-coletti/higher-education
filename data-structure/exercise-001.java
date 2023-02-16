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
        int s = 1;
        int e = 10;
        
        if (s % 2 != 0) {
            s++;
        }
        
        for (int i = s; i <= e; i += 2) {
            System.out.println(i);
        }
    }
}
