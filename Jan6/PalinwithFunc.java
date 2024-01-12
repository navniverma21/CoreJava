package Jan6;

import java.util.Scanner;

public class PalinwithFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String sb = sc.next();
        boolean result = isPal(sb);
        if (result) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not a Palindrome");
    }


    private static boolean isPal(String sb) {
        String s1 = sb;
        StringBuilder sb1 = new StringBuilder(sb);
        sb1.reverse();
        return s1.equalsIgnoreCase(sb1.toString());
    }

}
