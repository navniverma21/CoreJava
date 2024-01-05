package Dec30;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Swap2numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int temp=0;
        temp = a;
        a=b;
        b=temp;
        System.out.println("FIrst number:"+a);
        System.out.println(("Second number:"+b));
    }
}
