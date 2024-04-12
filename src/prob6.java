/*
     time complexity of the function is O(n)

The power function takes two parameters: a base number "a" and an exponent "n".
If the exponent "n" is 0, the function returns 1
because any number raised to the power of 0 is 1.
Otherwise, the function recursively calculates the power of "a" by multiplying "a" with
the result of power(a, n - 1) (i.e., "a" raised to the power of "n - 1").
This recursion continues until the exponent reaches 0, at which point the base case is triggered, and the recursion stops.


    */
import java.util.Scanner;
public class prob6 {
    public static int power(int a, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return a;

        }
        else{
            return power(a,n-1)*a;
        }
    }
    public static void main(String[] args){
        double start = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a,n));
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");

    }
}
