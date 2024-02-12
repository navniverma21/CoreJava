package Dec24;

public class FizzBuzz {
    public static void main(String[] args) {
        int[] a= new int[100];
        for(int i =0;i<a.length;i++){
            a[i]=i+1;
            if(a[i]%3 == 0)
                System.out.println("Fizz");
            else if(a[i]%5==0)
                System.out.println("Buzz");
            else if(a[i]%3==0 && a[i]%5==0)
                System.out.println("FizzBuzz");
            else
                System.out.println(a[i]);
        }
    }
}
