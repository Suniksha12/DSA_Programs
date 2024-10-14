/*Implement code in java in which we have been Given two arrays of positive integer Point[], Upvote[] of size N and a value K (1 <= K <= N). The task is to choose atleast K elements(Problems) such that the rating of the coding contest is maximum. 
Rating of contest: Rating of a contest is defined as total points of all problems in the contest multiplied by the minimum upvotes among all problems in the contest

Hence, Rating = sum of points of contest problems * minimum upvotes among contest problems.

Examples:

Input: Point[] = {2, 10, 3, 1, 5, 8}, Upvote[] = {5, 4, 3, 9, 7, 2}, K = 2 Output: 60 Explanation: Here we select 2nd and 5th problem to get the maximum rating of the contest. So maximum rating is (10 + 5) * min(4, 7) = 60 Input: Point[] = {2, 10, 3, 1, 5, 8}, Upvote[] = {5, 4, 3, 9, 7, 2}, K = 3 Output: 68 Explanation: Here we select 1st, 2nd and 5th problem to get the maximum rating of the contest. So maximum rating is (2 + 10 + 5) * min(5, 4, 7) = 68 Input: Point[] = {2, 20, 3, 1, 5, 8}, Upvote[] = {5, 10, 3, 9, 7, 2}, K = 4 Output: 200 Explanation: Here we select only 2nd problem to get maximum rating of the contest. A further selection of any problems decreases the rating. So maximum rating is 20 * 10 = 200

Time Complexity : O(N * logN)
Space Complexity : O(N)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class P03_maxi_possible_rating {
    static class Pair<K,V> {
         K key;
         V value;

         Pair(){}
         Pair(K key , V value){
             this.key = key;
             this.value = value;
         }
    }
    static int FindMaxRating(int N , int Point[], int Upvote[] , int K){
        ArrayList<Pair<Integer,Integer>> vec = new ArrayList<>();

        for(int i =0;i<N;i++){
            vec.add(new Pair(Point[i],Upvote[i]));
        }
        Collections.sort(vec,(p1,p2)->p2.value-p1.value);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int total_points = 0 , max_rating = 0;

        for(int i =0;i<K;i++){
            total_points = total_points + vec.get(i).key;
            max_rating = Math.max(max_rating, total_points * vec.get(i).value);
            pq.add(vec.get(i).key);
        }
        for(int i =K;i<N;i++){
            if(pq.peek() < vec.get(i).key){
                total_points = total_points - pq.peek() + vec.get(i).key;
                max_rating = Math.max(max_rating, total_points*vec.get(i).value);

                pq.poll();

                pq.add(vec.get(i).key);
            }
        }
        return max_rating;
    }
    public static void main(String[] args) {
        int Point[] = { 2, 10, 3, 1, 5, 8 };
    int Upvote[] = { 5, 4, 3, 9, 7, 2 };
 
    int N = Point.length;
    int K = 2;
 
    System.out.println("Maximum Rating of Coding Contest is: " + FindMaxRating(N, Point, Upvote, K));
  }
}
