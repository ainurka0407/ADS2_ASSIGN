/**
 * This method find the minimum number from the given array.
 * It uses recursion.
 * Time complexity is O(n), where n is the input number.
 * The base case of it when n is 1, so the minimum number will be this number with zero index.
 In the recursive case, it recursively finds the minimum element in the rest of the array (excluding the last element) and stores it in minInRest.
 Then, it compares minInRest with the last element of the array (arr[n - 1]) and returns the smaller of the two using Math.min.
 * This will continue until it reaches the base case.
 */
public class problem1 {
    public static int findMin(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        int min = findMin(arr,n-1);
        return Math.min(min,arr[n-1]);
    }
    public static void main(String[] args){
        int[] array = {10,1,32,3,45};
        int n = array.length;
        int min = findMin(array,n);
        double start = System.nanoTime();
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("MIN FROM ARRAY IS " + min);
        System.out.println("Time taken: " + duration + " ms");
    }
    }

