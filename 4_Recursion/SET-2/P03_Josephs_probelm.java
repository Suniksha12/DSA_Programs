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
