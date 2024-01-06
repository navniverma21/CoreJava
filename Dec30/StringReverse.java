package Dec30;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
       /* char a[]= s.toCharArray();
       * int left=0;
       * int right= s.length()-1;
       * while(left<right){
        *    char x=a[left];
         *   a[left]=a[right];
          *  a[right]=x;
           * left++;
           * right--;
        * }
        * System.out.println("Reversed String");
        *String reverse=new String(a);
       * System.out.println(reverse);
        */
        String n="";
        for (int i=s.length()-1;i>=0;i--){
            n=n+s.charAt(i);
        }
        System.out.println(n);
    }
}
