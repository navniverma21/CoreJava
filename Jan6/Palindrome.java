package Jan6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        StringBuilder s = new StringBuilder(sc.next());
        StringBuilder s1 = s;
        s.reverse();
        System.out.println(s.toString());
        if(s1.equals(s.toString())){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
