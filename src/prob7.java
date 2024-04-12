/**
 * Recursion algorithm for printing numbers in reverse order.
 * Time complexity is O(n).
 * It because algorithm passing the entering numbers only once, so this algorithm is linear.
 * This algorithm saves current number and calls this algorithm again, with decreased iter number.
 * When iter reaches 0, algorithm will stop receiving numbers and prints numbers from last to first.
 *
 * @param scanner Scanner object for user input.
 * @param iter    Remaining number of iterations.
 */
import java.util.Scanner;
public class prob7 {
    public static void Reversion(int n, int arr[] ){
        if(n<0){
            return;
        }
        System.out.print(arr[n]+" ");
        Reversion(n-1, arr);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        scanner.close();
        double start = System.nanoTime();

        System.out.print("Reversion: ");
        Reversion(n-1,array);
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");

    }
}
