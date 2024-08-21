/*Implement code in java in which You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once. 

Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

Approach - Count 0s and 1s

Time Complexity : O(N)
Space Complexity : O(1)*/
/* 
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
*/

/*Approach 2 - Use two indexes to traverse 
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
*/

/* 
public class P03_Segregate_array{
    void segregate0and1(int arr[], int size){
        int left =0,right = size - 1;
        while(left<right) {
            while(arr[left] == 0 && left < right) left++;
            while(arr[right] == 1 && left < right) right--;
            
            if(left<right){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        P03_Segregate_array seg = new P03_Segregate_array();
        int arr[] = new int[]{0, 1, 0, 1, 1, 1}; 
        int i, arr_size = arr.length; 
  
        seg.segregate0and1(arr, arr_size); 
  
        System.out.print("Array after segregation is "); 
        for (i = 0; i < 6; i++) 
            System.out.print(arr[i] + " ");
    }
}*/

/*Approach 3 - two pointer type 
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
*/

public class P03_Segregate_array{
    static void segregate0and1(int arr[]){
        int type0 = 0;
        int type1 = arr.length - 1;

        while(type0<type1) {
            if(arr[type0] == 1){
                if(arr[type1] != 1) {
                    arr[type1] = arr[type1] + arr[type0];
                    arr[type0] = arr[type1] - arr[type0];
                    arr[type1] = arr[type1] - arr[type0];
                }
                type1--;
            }
            else{
                type0++;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 1, 1, 1 }; 
  
        segregate0and1(array); 
  
        for (int a : array) { 
            System.out.print(a + " "); 
        }  
    }
}