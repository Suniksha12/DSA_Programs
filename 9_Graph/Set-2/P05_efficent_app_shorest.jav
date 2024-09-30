/*Another Approach:

The main idea is to use the formula Level(n) + Level(m) – 2* LCA(n,m)  . 
So Level can easily be calculated using Log base 2 and LCA can be 
calculated by dividing the greater No. by 2 until n and m become equal 

Time Complexity: O(log(max(x, y))) 
Spaec Complexity : O(1)*/

public class P05_efficent_app_shorest{
    static int LCA(int n , int m){
        if(n>m) {
            int temp = n;
            n=m;
            m=temp;
        }
        int a = (int)(Math.log(n)/Math.log(2));
        int b = (int)(Math.log(m)/Math.log(2));

        while(n!=m){
            if(n<m)
              m=m>>1;
            if(n>m)
              n=n>>1;
        }
        int v = (int)(math.log(n)/Math.log(2));
        return a+b-2*v;
    }
    public static void main(String[] args){
        int n =2,m=6;
        System.out.print(LCA(n,m) +"\n");
    }
}