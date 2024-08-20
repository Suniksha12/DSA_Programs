/*Implement code in java in which You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once. 

Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

Approach - Count 0s and 1s

Time Complexity : O(N)
Space Complexity : O(1)*/

public class P03_Segregate_array{
    static void Segregate(int arr[], int n ){
        int count = 0; // counts the no of zeros in arr 
      
        for (int i = 0; i < n; i++) { 
            if (arr[i] == 0) 
                count++; 
        }  
        for (int i = 0; i < count; i++) 
            arr[i] = 0; 

        for (int i = count; i < n; i++) 
            arr[i] = 1; 

    }
    static void print(int arr[] , int n){
        System.out.print("Array After segregation is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args){
        int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 }; 
        int n = arr.length; 
  
        Segregate(arr, n); 
        print(arr, n); 
    }
}
