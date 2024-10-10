/*Implement code in ajva in which we have been Given a string that has set of words and spaces, write a program to move hypen to front of string, by traversing the string only once.

Examples: 

Input  : str = "geeks_for_geeks"
Output : str = "___geeksforgeeks"

Input  : str = "move_these_spaces_to_beginning"
Output : str = "____movethesespacestobeginning"
There were four space characters in input,
all of them should be shifted in front.  

Approach -1 Using swap

Time Complexity : O(n)
Space Complexity : O(1)*/

/* 
public class P09_Move_hypen_beginning {
    static void move(char str[]) {
        int i = str.length - 1;
        for (int j = i; j >= 0; j--)
            if (str[j] != '_') {
                char c = str[i];
                str[i] = str[j];
                str[j] = c;
                i--;
            }
    }
    public static void main(String[] args) {
        char str[] = "Hey_there,_it's_GeeksforGeeks".toCharArray();
        move(str);
        System.out.println(String.valueOf(str));
    }
} */

/*Approach - 2 without using swap
 * 
 * time Complexity : O(n)
 * space complexity : O(1)
 */

 public class P09_Move_hypen_beginning {
    static void move(char str[]) {
        int i= str.length-1;
        for(int j=i;j>=0;j--)
            if(str[j]!='_')
               str[i--] = str[j];
        while(i>=0)
              str[i--]='_';
    }
    public static void main(String[] args) {
        char str[] = "Hey_there,_it's_GeeksforGeeks".toCharArray();
        move(str);
        System.out.println(String.valueOf(str));
    }
 }