/* Trapping Rainwater Problem states that given an array of N non-negative integers arr[] representing an elevation 
map where the width of each bar is 1, compute how much water it can trap after rain.

Approach - 1: Optimal Solution similar to linear search – 
O(N) Time and O(1) Space*/

import java.util.*;

public class P04_Trap_rain_water {
    public static int maxWater(int arr[] , int n) {
        int size = n - 1;
        int prev = arr[0];
        int prev_index = 0;
        int water = 0;
        int temp = 0;
        for(int i =1;i<=size;i++) {
            if(arr[i] >= prev) {
                prev = arr[i];
                prev_index = i;
                temp =0;
            } else {
                water += prev - arr[i];
                temp += prev - arr[i];
            }
        }
        if(prev_index < size) {
            water -= temp;
            prev = arr[size];
            for(int i = size;i>=prev_index;i--) {
                if(arr[i] >= prev) {
                    prev = arr[i];
                } else {
                    water += prev - arr[i];
                }
            }
        }
        return water;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int A = in.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[] = new int[A];
        for(int i =0;i<A;i++) {
            arr[i] = in.nextInt();
        }
        int n = arr.length;
        System.out.print(maxWater(arr, n));
        in.close();
    }
}
