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
        int start = 1;
        int end = 10;
        
        if (start % 2 != 0) {
            start++;
        }
        
        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }
    }
}
