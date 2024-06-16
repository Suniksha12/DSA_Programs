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

/* import java.util.*;
public class P01_Majority_wins {
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
} */

/* Approach - 2 Using Binary Search Tree 
 * Time Complexity : O(n^2)
 * Space Complexity : O(1)
*/

/* import java.util.*;
class Node {
    int key ;
    int c = 0;
    Node left, right;
}
public class P01_Majority_wins {
  static int ma =0;

  static Node newNode(int item) {
    Node temp = new Node();
    temp.key = item;
    temp.c =1;
    temp.left = temp.right=null;
    return temp;
  }
  static Node insert(Node node, int key) {
    if(node == null) {
        if(ma==0)
           ma = 1;

        return newNode(key);
    }
    if(key <node.key) 
       node.left = insert(node.left,key);
    else if(key>node.key)
            node.right = insert(node.right,key);
    else
        node.c++;

    ma = Math.max(ma,node.c);
    return node;
  }
  static void inorder(Node root, int s) {
    if(root != null) {
       inorder(root.left, s);
       if(root.c > (s/2))
          System.out.println(root.key + "\n");
        inorder(root.right, s);
    }
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array elements: ");
    int a[] = new int[5];
    int size = a.length;
    Node root = null;
    for(int i =0;i<size;i++){
        a[i] = in.nextInt();
        root = insert(root, a[i]);
    }
    if(ma > (size/2))
       inorder(root, size);
    else 
       System.out.println("No Majority Element");
       in.close();
  }
} */

/*Approach - 3 Hashing 
 * Time complexity :O(n)
 * Space Complexity : O(n)
 */

import java.util.*;
import java.util.HashMap;

public class P01_Majority_wins {
    static void findMajority(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<Integer,Integer>();
        int count =0;
        for(int i =0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                count = map.get(arr[i]) + 1;
                map.put(arr[i],count);
            }
            else {
                map.put(arr[i],1);
            }
            if(map.get(arr[i])>arr.length/2) {
                System.out.println(arr[i]);
                return;
            }
            
        }
        System.out.println("No Majority Element");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Elements");
        int a[] = new int[9];
        for(int i =0;i<a.length;i++) {
            a[i] =in.nextInt();
        }
        findMajority(a);
        in.close();
    }
}
