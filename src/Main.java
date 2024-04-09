public class Main {
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
        System.out.println("MIN FROM ARRAY IS " + min);
    }

}