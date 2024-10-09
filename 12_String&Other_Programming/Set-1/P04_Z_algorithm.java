/*Implement Code in java in which we have to implement Z- algorithm for linear time pattern seraching 
 * algorithm
 * 
 * Time Compelxity : O(m+n)
 * Space Complexity : O(n)
 */

public class P04_Z_algorithm {
    static void search(String text, String pattern){
        String concat = pattern + "$" + text;
        int l = concat.length();
        int z[] = new int[l];
        getZarr(concat,z);

        for(int i=0;i<l;++i) {
            if(z[i]==pattern.length()){
                System.out.println("Pattern found at index " + (i-pattern.length()-1));
            }
        }
    }
    static void getZarr(String str, int[] z){
        int n = str.length();
        int L=0,R=0;
        for(int i=1;i<n;++i){
            if(i>R){
                L=R=i;
                while (R<n && str.charAt(R-L)==str.charAt(R))
                    R++;
                z[i]=R-L;
                R--;
                }
                else {
                    int k = i-L;
                    if(z[k]<R-i+1)
                      z[i] = z[k];
                else {
                    L=i;
                    while(R<n && str.charAt(R-L)==str.charAt(R))
                         R++;
                         z[i] = R-L;
                         R--;
                }
            }
        }
    }
    public static void main(String[] args) {
        String text = "GEEKS FOR GEEKS";
        String pattern = "GEEK";

        search(text, pattern);
    }
}
