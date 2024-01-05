package Dec30;


import java.util.Scanner;

public class Diagonal2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("enter matrix elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal elements are");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j)
                    System.out.println(a[i][j]);
            }
        }
    }
}