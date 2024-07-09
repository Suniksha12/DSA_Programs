/*Implement Code in java such that we are Given an array where all elements appear even number of times except one. 
All repeating occurrences of elements appear in pairs and these pairs are not adjacent (there cannot be more than 
two consecutive occurrences of any element). Find the element that appears odd number of times. 

Note that input like {2, 2, 1, 2, 2, 1, 1} is valid as all repeating occurrences occur in pairs and these pairs are 
not adjacent. Input like {2, 1, 2} is invalid as repeating elements don’t appear in pairs. Also, input like 
{1, 2, 2, 2, 2} is invalid as two pairs of 2 are adjacent. Input like {2, 2, 2, 1} is also invalid as there are 
three consecutive occurrences of 2.

Example : 
Input: arr[] = {1, 1, 2, 2, 1, 1, 2, 2, 13, 1, 1, 40, 40, 13, 13}
Output: 13 

Time Complexity : O(log N)

Space Complexity : O(1)*/


public class P03_odd_occuring_element {
    static void search(int arr[] , int low , int high) {
        if(low > high)
           return;
        if(low == high) {
            System.out.print(arr[low]);
            return;
        }
        int mid = (low + high)/2;
        if(mid % 2 == 0) {
            if(arr[mid] == arr[mid + 1]) 
               search(arr, mid + 2, high);
            else
               search(arr, low, mid);
        }
        else {
            if(arr[mid] == arr[mid - 1])
               search(arr, mid + 1, high);
            else
               search(arr, low, mid - 1);
        }
    }
    public static void main(String[] args) 
    { 
        int arr[] = {1, 1, 2, 2, 1, 1, 2, 2, 13,  
                                    1, 1, 40, 40}; 
        int len = arr.length; 
        search(arr, 0, len-1); 
    } 
} 
