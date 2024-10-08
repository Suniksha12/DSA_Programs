/*Impplement Code in java in which we have been Given two strings string1 and string2, remove those characters from the first string(string1) which are present in the second string(string2). Both strings are different and contain only lowercase characters.
NOTE: The size of the first string is always greater than the size of the second string( |string1| > |string2|).

Example:


Input:
string1 = “computer”
string2 = “cat”
Output: “ompuer”
Explanation: After removing characters(c, a, t)
from string1 we get “ompuer”.


Input:
string1 = “occurrence”
string2 = “car”
Output: “ouene”
Explanation: After removing characters
(c, a, r) from string1 we get “ouene”.

Approach - 1 
Time Complexity : O(m+n)
Space Complexity : O(m) */

/*
public class P08_Remove_Characters {
    static final int NO_OF_CHARS = 256;

    static int[] getCharCountArray(String str) {
        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
        return count;
    }

    static String removeDirtyChars(String str, String mask_str) {
        int count[] = getCharCountArray(mask_str);
        int ip_ind = 0, res_ind = 0;
        char arr[] = str.toCharArray();

        while (ip_ind != arr.length) {
            char temp = arr[ip_ind];
            if (count[temp] == 0) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
        str = new String(arr);
        return str.substring(0, res_ind);
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String mask_str = "mask";
        System.out.println(removeDirtyChars(str, mask_str));
    }
} */

/*Efficient Solution 
 * 
 * Time Complexity : O(|S1|)
 * Space Complexity : O(1)
 */

 public class P08_Remove_Characters {
    static String removeChars(String s1, int n1 , String s2, int n2){
        String s3=" ";
        int[] arr = new int[26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        for(int i=0;i<n2;i++)
            arr[s2.charAt(i)-'a']=-1;
        for(int i=0;i<n1;i++){
            if(arr[s1.charAt(i)-'a']!=-1){
                s3+=s1.charAt(i);
            }
        }
        s1=s3;
        return s1;
    }
    public static void main(String[] args) {
        String string1 = "geeksforgeeks";
        String string2 = "mask";
 
        int n1 = string1.length();
        int n2 = string2.length();
        System.out.println(
            removeChars(string1, n1, string2, n2));
    }
 }