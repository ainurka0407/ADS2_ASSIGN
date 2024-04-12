public class prob9 {
    /*
    * The function binom(int n, int k) calculates the binomial coefficient of n choose k.
In the base case, if k is equal to n or k is equal to 0, then the binomial coefficient is 1. This is because choosing all elements (k = n) or choosing none (k = 0) results in only one possibility.
In the recursive case, the binomial coefficient is calculated by summing the binomial coefficients of choosing k elements from (n-1) and choosing (k-1) elements from (n-1). This is based on the combinatorial identity of Pascal's triangle.
The recursion continues until it reaches one of the base cases.

    The time complexity of this recursive approach to calculate the binomial coefficient is exponential, O(2^n).

     */
    public static long binom(int n, int k)
    {
        if (k==n || k==0)
            return 1;
        else return binom(n-1,k-1) + binom(n-1, k);
    }

    public static void main(String[] args) {
        int n =7;
        int k=3;
        System.out.println(binom(n ,k));
    }
}