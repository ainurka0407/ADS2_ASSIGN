/**
 * This method find the average number from the given array.
 * It uses recursion.
 * Time complexity is O(n), where n is the input number.
 * The base case of it when n is 0, so the average number will be 0.
 * In recursive case it adds the value of the element at index n-1 to the sum of elements up to n-1.
 * This will continue until it reaches the base case.
 */


public class prob2 {
    public static double FindAverage(int[] arr, int n){
        if(n==0){
            return 0;
        }
        return arr[n-1]+ FindAverage(arr,n-1);
    }
    public static void main(String[] args){
        int n=4;
        int [] arr = {3,2,4,1};
        double start = System.nanoTime();
        double av = FindAverage(arr, n);
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("AVERAGE FROM ARRAY IS " + av/n);
        System.out.println("Time taken: " + duration + " ms");
    }
}
