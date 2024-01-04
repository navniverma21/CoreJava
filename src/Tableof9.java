package src;

public class Tableof9 {
    public static void main(String[] args) {
        int i = 1, j;
        for (i = 1; i <= 10; i++) {
            //  System.out.println("9 * "+i+" = "+(9*i));
            j = 9 * i;
            System.out.printf("\n  9 * %d = %d", i,j);
            /* %d- Integer, long, byte,short
            * %c- char
            * %s - string
            * %f- float
             */

        }
    }
}
