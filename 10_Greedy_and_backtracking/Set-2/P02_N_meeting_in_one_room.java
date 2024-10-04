/*Implement Code in java in which we have N meetings in one room
You are given timings of n meetings in the form of (start[i], end[i]) where start[i] 
is the start time of meeting i and end[i] is the finish time of meeting i. 
Return the maximum number of meetings that can be accommodated in a single meeting room, 
when only one meeting can be held in the meeting room at a particular time. 

Note: The start time of one chosen meeting can't be equal to the end time of the other chosen meeting.

Examples :

Input: n = 6, start[] = [1, 3, 0, 5, 8, 5], end[] =  [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: Maximum four meetings can be held with given start and end timings. The meetings are - (1, 2), (3, 4), (5,7) and (8,9)
Input: n = 3, start[] = [10, 12, 20], end[] = [20, 25, 30]
Output: 1
Explanation: Only one meetings can be held with given start and end timings.

Expected Time Complexity: O(n*logn)
Expected Auxilliary Space: O(n)
 */

public class P02_N_meeting_in_one_room {
    public static int maxMeetings(int n, int start[], int end[]) {
        int s = start[0];
        int e = end[0];
        int count = 1,i=1;
        while(i<n){
            if(start[i]>e){
                e = end[i];
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n =6;
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(n,start,end));

    }
}
