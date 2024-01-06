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
       /*  System.out.println("Diagonal elements are");
       * for (int i = 0; i < a.length; i++) {
        *    for (int j = 0; j < a[i].length; j++) {
         *       if (i == j)
          *          System.out.println(a[i][j]);
            }
        }*/
        System.out.println("Diagonal elements in reverse are");
        for(int x=a.length-1;x>=0;x--){
            for (int y=a[x].length;y>=0;y--){
                if(x==y)
                    System.out.println(a[x][y]);
            }
        }
    }
}