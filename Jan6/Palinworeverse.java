package Jan6;

import java.util.Scanner;

public class Palinworeverse {
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

    private static boolean isPal(String sb){
        // String s1= sb;
        String n="";
        for (int i=sb.length()-1;i>=0;i--){
            n=n+sb.charAt(i);
        }
        String s2=n;
        return sb.equalsIgnoreCase(s2);
    }
}
