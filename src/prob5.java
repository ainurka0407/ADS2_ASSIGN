/*
   time complexity O(2^n)  because for each call to compute
   the nth Fibonacci number, it makes two recursive calls
   to compute (n-1)th and (n-2)th Fibonacci numbers.

The fibonacci function calculates the nth Fibonacci number recursively.
It starts with two base cases: if n is 1 or 2, it returns 1 because the first two Fibonacci numbers are both 1.
For any other value of n, it recursively computes the Fibonacci number by summing the previous two Fibonacci numbers.
The main method calls the fibonacci function with n = 17 (or any other value you specify) and prints the result.
  */
public class prob5 {
    public static int Fibo(int n){
        if(n==0){
            return (0);
        }
        if(n==1){
            return (1);
        }
        else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    public static void main(String[] args){
        double start = System.nanoTime();

        int n = 17;
        System.out.println(Fibo(n));
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");

    }
}
