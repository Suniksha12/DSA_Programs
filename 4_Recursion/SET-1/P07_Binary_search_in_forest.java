/*Implement Code in java in which There are n trees in a forest. The heights of the trees is stored in array tree[], where tree[i] denotes the height of the ith tree in the forest. If the ith tree is cut at a height H, then the wood collected is tree[i] - H, provided tree[i] > H. If the total woods that needs to be collected is exactly equal to k, find the height H at which every tree should be cut (all trees have to be cut at the same height). If it is not possible then return -1 else return H.

Example 1:

Input:
n = 5, k = 4
tree[] = {2, 3, 6, 2, 4}
Output: 3
Explanation: Wood collected by cutting trees
at height 3 = 0 + 0 + (6-3) + 0 + (4-3) = 4
hence 3 is to be subtracted from all numbers.
Since 2 is lesser than 3, nothing gets
subtracted from it.

Expected Time Complexity: O(n log h)
Expected Auxiliary Space: O(1)*/

public class P07_Binary_search_in_forest {
    static int find_height(int tree[] , int n , int k){
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<n;i++) {
            if(tree[i] > max)
               max = tree[i];
               sum += tree[i];
        }
        int counter;
        for(int h = 1;h<=max;h++) {
            counter = sum;
            for(int j =0;j<n;j++) {
                if(tree[j] <= h)
                    counter -= tree[j];
                else
                    counter -= h;
            }
            if(counter == k)
               return h;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 6;
        int k =8;
        int[] tree= {1,7,6,3,4,7};
        System.out.print(find_height(tree, n, k));
    }
}
