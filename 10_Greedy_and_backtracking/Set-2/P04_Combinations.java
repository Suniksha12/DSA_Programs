/*Implement code in java in which we have been Given two numbers n and k, you have to print all possible combinations of k numbers from 1…n.

Examples: 

Input : n = 4 
        k = 2

Output: 1 2 
               1 3
               1 4
               2 3
               2 4
               3 4
Time Complexity : O((nCk)*k)
Space Complexity : O((nCk)*k)*/

import java.util.Vector;
public class P04_Combinations {
    static Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
    static Vector<Integer> tmp = new Vector<Integer>();
    static void makeCombiUtil(int n , int left, int k){
        if(k==0) {
            ans.add(tmp);
            for(int i=0;i<tmp.size();i++){
                System.out.print(tmp.get(i)+" ");
            }
           System.out.println();
           return;
        }
        for(int i=left;i<=n;++i) {
            tmp.add(i);
            makeCombiUtil(n,i+1,k-1);
            tmp.remove(tmp.size()-1);
        }
    }
    static Vector<Vector<Integer>> makeCombi(int n,int k){
        makeCombiUtil(n,1,k);
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        ans = makeCombi(n, k);
    }
}
