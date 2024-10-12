/*Implement code in java in which we have been gievn suppose Abhishek, a blind man has N distinct binary strings all of the equal lengths. A binary string only contains '0's and '1's. The strings are numbered from 1 to N and all are distinct strings. Abhishek can only differentiate between these strings by touching them. In one touch Abhishek can identify one character at a position of any particular string from the set. Your task is to find the minimum number of touches Abhishek has to make so that he finds that all strings are different.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
3 <= N <= 10
1 <= k <= 100
Where k  is the length of the string. 
All the strings are distinct.

Time Limit: 1 sec
Sample Input 1:
2
3
11100
11101
01100
2
111
000
Sample Output 1:
5
2
Explanation for Sample Input 1:
For the first test case :
There are three strings.
First Abhishkek will touch the last character of all strings.
For the first and third-string Abhishek will identify 0 for the first and third strings and for the second string Abhishek will identify 1. In this way, Abhishek will be able to distinguish the 2nd string.
Next Abhishek will touch 1st character of the 1st and 3rd string. Abhishek will identify 1 for 1st string and 0 for the third string. In this way, Abhishek will distinguish 1st and 3rd strings.
Thus the total number of touches Abhishek make is 5.

For the second test case :
There are two strings.
Abhishek will touch the first character of the first and second string. Abhishek will identify 1 for 1st string and 0 for the second string. In this way, Abhishek will distinguish 1st and 2nd strings.
Sample Input 2:
2
4
10010
11010
01010
01100
3
000101
100010
111000
Sample Output 2:
 8
 5 */

 import java.util.ArrayList;
public class P04_Brailles_Dilemma {
	public static int minimumTouchesRequired(int N, ArrayList<String> arr) {
		// Write your code here.
        return rec(arr);
	}
    public static int rec(ArrayList<String> arr){
        int n = arr.size();
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 5;

        ArrayList<String> cur1 = new ArrayList<>();
        ArrayList<String> cur2 = new ArrayList<>();

        int sz = arr.get(0).length();
        int dif = Integer.MAX_VALUE;
        int fid =0;

        for(int i=0;i<sz;i++){
            int g1 =0,g2=0;
            for(int j=0;j<n;j++){
                if(arr.get(j).charAt(i)=='0') g1++;
                else g2++;
            }
            if(dif >= Math.abs(g1-g2)){
                dif = Math.abs(g1-g2);
                fid = i;
            }
        }
        for(int i=0;i<n;i++){
            if(arr.get(i).charAt(fid)=='0') cur1.add(arr.get(i));
            else cur2.add(arr.get(i));
        }
        return n + rec(cur1) + rec(cur2);
    }
}

