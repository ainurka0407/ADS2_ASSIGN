public class prob10 {
    /*
    * The function gcd(int a, int b) takes two integers a and b as input.
In the base case, if b is 0, it means that a is the GCD of a and b, so we return a.
In the recursive case, we call the gcd function with b and the remainder of a divided by b. This is based on the property that GCD(a, b) is the same as GCD(b, a % b).
We continue this process until we reach the base case, where we have found the GCD.

*
* The time complexity of the Euclidean algorithm for finding the GCD using recursion is logarithmic, O(log(min(a, b))).
* */
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}