package Dec30;

import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter numbers");
            arr[i]= sc.nextInt();
        }
        System.out.println("Numbers are: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
