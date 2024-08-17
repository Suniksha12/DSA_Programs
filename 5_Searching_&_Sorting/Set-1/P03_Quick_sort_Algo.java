/*Implement code in java in which we have to implement Quick Sort algorithm.
 * 
 * QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot and 
 * partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.
 * 
 * One of the algorithm performed using the partition method.
 * 
 * Time Complexity : O(N ^ 2)
 * 
 * Space Complexity : O(1)
 */

public class P03_Quick_sort_Algo {
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low;j<=high-1;j++){
            if(arr[j] < pivot) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return(i+1);
    }
    static void QuickSort(int[] arr , int low , int high){
        if(low < high){
           int pi = partition(arr, low, high);

           QuickSort(arr,low,pi-1);
           QuickSort(arr,pi+1,high);
        }
    }
    public static void printArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};
        int N = arr.length;
        QuickSort(arr,0,N-1);
        System.out.println("Sorted Array");
        printArr(arr);
    }
}
