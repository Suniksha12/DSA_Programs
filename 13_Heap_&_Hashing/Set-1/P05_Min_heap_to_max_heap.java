/*Implement code in java such that we have been Given an array representation of min Heap, convert it to max Heap.

Examples: 
Input: arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9}

               3
            /     \
          5       9
        /   \    /  \
      6     8  20   10
    /  \   /
12   18 9 

Output: arr[] = {20, 18, 10, 12, 9, 9, 3, 5, 6, 8}

           20
         /    \
      18      10
     /    \    /  \
  12     9  9    3
 /  \   /
5    6 8 

Input: arr[] = {3, 4, 8, 11, 13}
Output:  arr[] = {13, 11, 8, 4, 3} 

Time Complexity : O(N)
Space Complexity : O(N)*/

public class P05_Min_heap_to_max_heap {
    static void maxHeap(int arr[] , int i, int N){
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if(l<N && arr[l] > arr[i])
           largest = l;
        if(r<N && arr[r] > arr[largest])
           largest = r;
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeap(arr, i, N);
        }
    }
    static void convertHeap(int arr[], int N){
        for(int i= (N-2)/2;i>=0;--i)
            maxHeap(arr, i, N);
    }
    static void printArray(int arr[], int size){
        for(int i=0;i<size;++i)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args){
        int arr[] = { 3, 5, 9, 6, 8, 20, 10, 12, 18, 9 };
        int N = arr.length;
 
        System.out.print("Min Heap array : ");
        printArray(arr, N);
 
        convertHeap(arr, N);
 
        System.out.print("\nMax Heap array : ");
        printArray(arr, N);
    }
}
