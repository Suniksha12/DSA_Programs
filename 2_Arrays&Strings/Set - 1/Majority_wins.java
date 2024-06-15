//Implement Code in java

/* Find the majority element in the array. 
A majority element in an array A[] of size n is an element that appears more than n/2 times 
(and hence there is at most one such element). 

Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

Time Complexity : O(n*n)
Spcae Complexity : O(1)

Approach - 1 : Use two nested loop and traverse the array from start to end.*/

import java.util.*;
public class Majority_wins {
    static void findMajority(int arr[] , int n) {
        int maxCount =0;
        int index = -1;
        for(int i =0;i<n;i++) {
            int count =0;
            for(int j =0;j<n;j++) {
                if(arr[i] == arr[j]) 
                   count++;
            }
            if(count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if(maxCount > n/2)
           System.out.println(arr[index]);
        else 
           System.out.println("No Majority Element");
    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = in.nextInt();
    System.out.print("Enter the Array Element : ");
    int arr[] = new int[n];
    for(int i =0;i<n;i++) {
        arr[i] = in.nextInt();
    }
    findMajority(arr,n);
    in.close();
}
}