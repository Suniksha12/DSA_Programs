/*Implement Code in java in which we will implement An efficient approach is to use the property 
of 2*x and 2*x+1 given. Keep dividing the larger of the two nodes by 2. 
If the larger becomes the smaller one, then divide the other one. 
At a stage, both the values will be the same, keep a count on the number of divisions done which will be the answer.  

Time Complexity: O(log(max(x, y)))
Space Comeplxity : O(1) */

public class P04_shorest_appr2 {
    static int Distance(int x, int y){
        if(x<y){
        int temp = x;
        x=y;
        y=temp;
        }
    int c=0;
    while(x!=y) {
        ++c;
        if(x>y)
           x=x>>1;
        if(y>x){
            y=y>>1;
            ++c;
        }
    }
   return c;
}
public static void main(String[] args) {
    int x=4,y=6;
    System.out.println(Distance(x,y));
}
}
