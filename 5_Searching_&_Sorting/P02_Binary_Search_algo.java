/*Implement Code in java in which We need to appky for binary search algorithm
 * 
 * Input : arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, and the target = 23.
 * Output : Element is present at index 3
 * 
 * Time Complexity : O(log N)
 * Space Complexity : O(1)
 */

/* 
public class P02_Binary_Search_algo {
    int binarySearch(int arr[] , int x) {
        int low =0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == x) return mid;

            if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        P02_Binary_Search_algo ob = new P02_Binary_Search_algo();
        int arr[] = { 2,3,4,10,40};
        int x = 10;
        int result = ob.binarySearch(arr,x);
        if(result == -1)
           System.out.println("Element is not present in array");
        else  
           System.out.println("Element is present at " + "index " + result);
    }
} */

/*Approach - 2 Recursive Binary Search Algorithm
 * 
 * Time Complexity : O(log N)
 * 
 * Space Complexity : O(1) 
 */

 public class P02_Binary_Search_algo {
     int BinarySearch(int arr[] , int low , int high , int x) {
         if(high >= low) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == x) return mid;

            if(arr[mid] > x) 
               return BinarySearch(arr, mid - 1, low, x);
            return BinarySearch(arr, mid+1 , high , x);
         }
         return -1;
     }
     public static void main(String[] args) {
        P02_Binary_Search_algo ob = new P02_Binary_Search_algo();
        int arr[] = { 2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.BinarySearch(arr,0,n-1,x);
        if(result == -1)
           System.out.println("Element is not present in array");
        else  
           System.out.println("Element is present at " + "index " + result);
    }
 }