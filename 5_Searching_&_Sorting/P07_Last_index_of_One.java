/*Implement Code in java in which Given a string str and a character x, find last index of x in str.

Examples : 

Input : str = "geeks", x = 'e'
Output : 2
Last index of 'e' in "geeks" is: 2 

Input : str = "Hello world!", x = 'o'
Output : 7
Last index of 'o' is: 7 

Approach - 1 Traverse the whole string

Time Complexity : O(N)
Space Complexity : O(1)*/

public class P07_Last_index_of_One {
    static int FindLastIndex(String str, Character ch){
        int index =-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                index =i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        Character x = 'e';
        int index = FindLastIndex(str,x);
        if(index == -1){
            System.out.println("Charactre not found");

        }
        else {
            System.out.println("Last Index is "+ index);
        }
    }
}
