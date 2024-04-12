/*
    time complexity of the Factorial function is O(n)

    This is a recursive function to compute the factorial of a given number n.
    It has a base case: if n is 0, it returns 1, as the factorial of 0 is defined to be 1.
    Otherwise, it recursively calls itself with n-1 and multiplies the result by n.
    The recursion continues until it reaches the base case.
    When n reaches 0, it starts returning back, multiplying each return value by the current n, until it reaches the initial call.

    */
public class prob4 {
    public static int Factor(int n){
        if(n==1){
            return (1);
        }
        if(n==2){
            return (2);
        }
        else{
            return n*Factor(n-1);
        }
    }
    public static void main(String[] args){
        double start = System.nanoTime();

        int n=5;
        System.out.println(Factor(n));
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");

    }
}
