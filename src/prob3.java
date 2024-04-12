import java.util.Scanner;
//This function recursively  checks whether given number n is prime or not using two cases. The base case:
//    if n less than or equal to 1, it returns false, because 1 any negative numbers are not prime.
//If the divisor reaches 1, it returns true because if n is not divisible by any number up to n/2, it's prime.
//It then checks if n is divisible by the current divisor. If it is, it returns false because n is not prime.
//If n is not divisible by the current divisor, it recursively calls itself with n and the next divisor down to 1.
//This function runs recursively until it either finds a divisor that divides n, in which case it returns false, or
// it reaches a divisor of 1, in which case it returns true.
//Time complexity is O(n).

public class prob3 {
    public static boolean Prime(int n, int divisor){
        if(n<=1){
            return false;
        }
        if (divisor == 1){
            return true;
        }
        if (n%divisor==0){
            return false;
        }
        return Prime(n,divisor-1);
    }
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int number = scanner.nextInt();
        scanner.close();
        double start = System.nanoTime();

        boolean Prime = Prime(number, number/2);
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        if(Prime){
            System.out.println(number+" is prime");
        }
        else{
            System.out.println(number+" is not prime");
        }
        System.out.println("Time taken: " + duration + " ms");
    }
    }

