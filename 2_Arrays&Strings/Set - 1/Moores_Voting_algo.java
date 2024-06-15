//Implement a code in java

/* The steps below to find the Majority Element using Moore's Voting Algorithm

Loop through each element and maintains a count of the majority element, and a majority index, maj_index
If the next element is the same then increment the count if the next element is not the same then decrement the count.
if the count reaches 0 then change the maj_index to the current element and set the count again to 1.
Now again traverse through the array and find the count of the majority element found.
If the count is greater than half the size of the array, print the element
Else print that there is no majority element 

Time Complexity : O(n)
Space Complexity : O(1)*/

import java.util.*;
public class Moores_Voting_algo {
    static int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;
        int i;
        for(i =1;i<size;i++) {
            if(a[maj_index] == a[i]) 
               count++;
            else 
               count--;
            if(count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    static void printMajority(int a[], int size) {
        int cand = findCandidate(a,size);

        if(isMajority(a,size,cand))
           System.out.println(" " + cand + " ");
        else 
           System.out.println("No Majority Element");
    }

    static boolean isMajority(int a[], int size, int cand) {
        int i, count = 0;
        for(i =0;i<size;i++) {
            if(a[i]==cand)
               count++;
      }
      if(count > size / 2)
         return true;
      else
         return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Enter elements in Array: ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = in.nextInt();
        }
      int size = a.length;
      printMajority(a, size);
      in.close();
    }
}
