/*Implement code ina java in which we have Given an array of size n that has the following specifications: 

Each element in the array contains either a policeman or a thief.
Each policeman can catch only one thief.
A policeman cannot catch a thief who is more than K units away from the policeman.
We need to find the maximum number of thieves that can be caught.
Examples: 
 

Input : arr[] = {'P', 'T', 'T', 'P', 'T'},
            k = 1.
Output : 2.
Here maximum 2 thieves can be caught, first
policeman catches first thief and second police-
man can catch either second or third thief.

Input : arr[] = {'T', 'T', 'P', 'P', 'T', 'P'}, 
            k = 2.
Output : 3.

Input : arr[] = {'P', 'T', 'P', 'T', 'T', 'P'},
            k = 3.
Output : 3.

Time Complexity : O(N)
Space Complexity : O(N)*/

/*
import java.util.*;

public class P01_thieve_police {
    static int policeThief(char arr[], int n, int k) {
        int res = 0;
        ArrayList<Integer> thi = new ArrayList<>();
        ArrayList<Integer> pol = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P')
                pol.add(i);
            else if (arr[i] == 'T')
                thi.add(i);
        }

        int l = 0, r = 0;
        while (l < thi.size() && r < pol.size()) {
            if (Math.abs(thi.get(l) - pol.get(r)) <= k) {
                res++;
                l++;
                r++;
            } else if (thi.get(l) < pol.get(r))
                l++;
            else
                r++;

        }
        return res;
    }

    public static void main(String[] args) {
        int k, n;
        char arr1[] = new char[] { 'P', 'T', 'T', 'P', 'T' };
        k = 2;
        n = arr1.length;
        System.out.println("Maximum thieves caught: "
                + policeThief(arr1, n, k));

        char arr2[] = new char[] { 'T', 'T', 'P', 'P', 'T', 'P' };
        k = 2;
        n = arr2.length;
        System.out.println("Maximum thieves caught: "
                + policeThief(arr2, n, k));

        char arr3[] = new char[] { 'P', 'T', 'P', 'T', 'T', 'P' };
        k = 3;
        n = arr3.length;
        System.out.println("Maximum thieves caught: "
                + policeThief(arr3, n, k));
    }
} */

/*Approach - 2 Efficent approach
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

import java.util.*;

public class P01_thieve_police {
    static int policeThief(char arr[] , int n , int k){
        int pol = -1,thi=-1,res=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='P'){
               pol=i;
               break;
        }
    }
    for(int i=0;i<n;i++){
        if(arr[i]=='T'){
            thi=i;
            break;
        }
    }
    if(thi==-1 || pol==-1)
        return 0;
    while(pol<n && thi<n){
        if(Math.abs(pol-thi)<=k) {
            pol++;
            while(pol<n && arr[pol]!= 'P')
                 pol++;
            thi = thi+1;
            while(thi<n && arr[thi]!= 'T')
                  thi++;
            res++;
        }
        else if(thi<pol){
            thi++;
            while (thi<n && arr[thi]!= 'T')
                thi++;
            }else{
                pol++;
                while (pol<n&&arr[pol] !='P') {
                    pol++;
                }
            }
            return res;
    }

    public static void main(String[] args) {
        char arr1[] = { 'P', 'T', 'T', 'P', 'T' };
        int n = arr1.length;
        int k = 2;
        System.out.println("Maximum thieves caught: "
                + policeThief(arr1, n, k));

        char arr2[] = { 'T', 'T', 'P', 'P', 'T', 'P' };
        n = arr2.length;
        k = 2;
        System.out.println("Maximum thieves caught: "
                + policeThief(arr2, n, k));

        char arr3[] = { 'P', 'T', 'P', 'T', 'T', 'P' };
        n = arr3.length;
        k = 3;
        System.out.println("Maximum thieves caught: "
                + policeThief(arr3, n, k));
    }
}