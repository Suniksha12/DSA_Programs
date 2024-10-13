/*Implement code in java in which we have been given the sequence 

\ S = {1, 2, 3 \dots N}                       
find the lexicographically smallest (earliest in dictionary order) derangement of 
\ S                    
A derangement of S is any permutation of S such that no two elements in S and its permutation occur at the same position.

Examples:   

Input: 3
Output : 2 3 1
Explanation: The Sequence is 1 2 3.
Possible permutations are (1, 2, 3), (1, 3, 2),
          (2, 1, 3), (2, 3, 1), (3, 1, 2) (3, 2, 1).
Derangements are (2, 3, 1), (3, 1, 2).
Smallest Derangement: (2, 3, 1)

Input : 5
Output : 2 1 4 5 3.
Explanation: Out of all the permutations of 
(1, 2, 3, 4, 5), (2, 1, 4, 5, 3) is the first derangement.

Approach - 1 Using Heap
Time Complexity : O(N * log N)
Space Complexity : O(n)*/

/* 
import java.util.PriorityQueue;

public class P01_smallest_dearrangement_sequence {
       static void generate_derangement(int N){
        int[] s = new int[N+1];
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        for(int i =1;i<=N;i++){
            s[i]=i;
            PQ.add(s[i]);
        }
        int[] D = new int[N+1];
        for(int i=1;i<=N;i++){
            int d = PQ.peek();
            if(d!=s[i] || i==N){
                D[i] = d;
            } else {
                D[i] = PQ.peek();
                PQ.remove();
                PQ.add(d);
            }
        }
        if(D[N]==s[N]){
           int t = D[N-1];
           D[N-1] = D[N];
           D[N]=t;
        }
        for (int i = 1; i <= N; i++) 
    System.out.printf("%d ", D[i]);    
  System.out.printf("\n");
       }
       public static void main(String[] args) {
        generate_derangement(10);
       }
} */

/*Approach - 2 Using formula
 * Time Complexity: O(n)
 * Space Complexity : O(n)
 */

 public class P01_smallest_dearrangement_sequence {
      static void generate_derangement(int N){
        int S[] = new int[N+1];
        for(int i=1;i<=N;i++)
           S[i] = i;
        int D[] = new int[N+1];
        for(int i=1;i<=N;i+=2){
            if(i==N){
                D[N] = S[N-1];
                D[N-1]= S[N];
            } else {
                D[i] = i+1;
                D[i+1] = i;
            }
        }
        for (int i = 1; i <= N; i++) 
        System.out.print(D[i] + " "); 
    System.out.println(); 
      }
      public static void main(String[] args) {
        generate_derangement(10);
      }
 }