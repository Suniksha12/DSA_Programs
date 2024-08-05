/*Implement Code in java in which There are N people standing in a circle waiting to be executed. The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom. 

Given the total number of persons N and a number k which indicates that k-1 persons are skipped and the kth person is killed in a circle. The task is to choose the person in the initial circle that survives.

Examples:

Input: N = 5 and k = 2
Output: 3
Explanation: Firstly, the person at position 2 is killed, 
then the person at position 4 is killed, then the person at position 1 is killed. 
Finally, the person at position 5 is killed. So the person at position 3 survives. 

Approach 1 - Using List

Time Complexity : O(N^2)
Space Complexity : O(N)*/

/*
import java.util.ArrayList;
import java.util.List;

public class P03_Josephs_probelm {
    static void joseph(List<Integer> person , int k , int index) {
        if(person.size()==1){
           System.out.println(person.get(0));
           return;
        }
        index = ((index + k) % person.size());
        person.remove(index);
        joseph(person, k, index);
    }
    public static void main(String[] args) {
        int n =14;
        int k =2;
        k--;
        int index =0;
        List<Integer> person = new ArrayList<>();
        for(int i =1;i<=n;i++) {
            person.add(i);
        }
        joseph(person, k, index);
    }
    
}
*/

/*Approach 2 - Recursive Approach
 * 
 * Time Complexity : O(N^2)
 * Space Complexity : O(N)
 */

/*
 public class P03_Josephs_probelm {
    public static void main(String[] args) {
        int n =14, k=2;
        System.out.println(joseph(n,k));
    }
    public static int joseph(int n, int k) {
        k--;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = 1;
        }
        int cnt =0,cut =0,num =1;
        while(cnt <(n-1)) {
            while(num <= k) {
                cut++;
                cut = cut % n;
                if(arr[cut] == 1) {
                    num++;
                }
            }
            num =1;
            arr[cut] =0;
            cnt++;
            cut++;
            cut = cut % n;
            while(arr[cut] == 0) {
                cut++;
                cut = cut % n;
            }
        }
        return cut + 1;
    }
 } */

 /*Approach 3 - in Linear time and Space Compelxity
  * 
  Time Complexity : O(N)
  Space Compelxity : O(1)

  */

  public class P03_Josephs_probelm {
    static int joseph(int N , int K){
        int i =1,ans=0;
        while(i<=N) {
            ans = (ans + K) % i;
            i++;
        }
      return ans + 1;
    }
    public static void main (String[] args) {

        int N = 14, k = 2;
        int ans = joseph(N, k);
        System.out.println(ans);
    }
  }