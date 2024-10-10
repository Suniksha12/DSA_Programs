/*Implement code in java in which we have been Given a string str and an integer K, the task is to find the K-th most frequent character in the string. If there are multiple characters that can account as K-th most frequent character then, print any one of them.
Examples: 
 
Input: str = “GeeksforGeeks”, K = 3 
Output: f 
Explanation: 
K = 3, here ‘e’ appears 4 times 
& ‘g’, ‘k’, ‘s’ appears 2 times 
& ‘o’, ‘f’, ‘r’ appears 1 time. 
Any output from ‘o’ (or) ‘f’ (or) ‘r’ will be correct.
Input: str = “trichotillomania”, K = 2 
Output: l 

Time Complexity : O(NlogN)
Space Complexity : O(N)*/

import java.util.Arrays;
import java.util.HashMap;

public class P10_kth_most_frequent_character {
    static class pair implements Comparable<pair> {
        char ch;
        int freq;
        pair(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
        public int compareTo(pair a){
            return a.freq - this.freq;
        }
    }
    static char sortByFreq(String str, int k){
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i=0;i<str.length();++i){
            char ch = str.charAt(i);
            int freq = m.getOrDefault(str.charAt(i), 0) + 1;
            m.put(ch, freq);
        }
        pair[] v = new pair[m.size()];
        int idx =0;
        for(Character ch: m.keySet()) {
           v[idx++] = new pair(ch, m.get(ch));
        }
        Arrays.sort(v);

        int count =0;
        for(int i=0;i<v.length;i++) {
            if(i == 0 || v[i].freq != v[i-1].freq)
               count++;
            if(count==k)
               return v[i].ch;
        }
        return '.';
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int k = 3;
        System.out.println(sortByFreq(str, k));
    }
}
