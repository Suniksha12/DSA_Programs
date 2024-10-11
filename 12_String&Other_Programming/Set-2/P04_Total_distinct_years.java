/*Implement code in java in which we have beenGiven a string containing the words and dates, the task is to find the number of distinct years mentioned. 
Note: Assuming that the date will be in ‘DD-MM-YYYY’ format and the string will end with a full stop.

Examples:  
Input:  str = “UN was established on 24-10-1945. India got freedom on 15-08-1947.”
Output: 2
Explanation: 2 distinct years i.e. 1945 and 1947 have been referenced.

Input: str = “Soon after the world war 2 ended on 02-09-1945. The UN was established on 24-10-1945.”
Output: 1
Explanation: Only 1 Year, i.e 1945 has been referenced .

Approach - Using unordered set
Time Complexity : O(n)
Space Compelxity : O(n)*/

import java.util.Set;
import java.util.HashSet;
public class P04_Total_distinct_years {
    static int distinct_year(String str){
        String str2= "";
        Set<String> uniqueDates = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                str2 += (str.charAt(i));
            }
            if(str.charAt(i)=='-'){
                str2="";
            }
            if(str2.length()==4){
                uniqueDates.add(str2);
                str2="";
            }
        }
        return uniqueDates.size();
    }
    public static void main(String[] args) {
        String str = "UN was established on 24-10-1945."
                + "India got freedom on 15-08-1947.";
 
        System.out.println(distinct_year(str));
    }
}
