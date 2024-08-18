/*Implement Code in java in which we are given a String ans we need to sort it.
 * 
 * Approach - 1 Without using sort method
 * 
 * Input string : "geeksforgeeks"
   Output string : "eeeefggkkorss"

   Time Complexity : O(n * log n)
   Space Complexity : O(n * log n)
 */

/*
public class P02_Sort_String {
    void merge(char arr[] , int l , int m , int r){
        int n1= m-l+1;
        int n2 = r-m;

        char L[] = new char[n1];
        char R[] = new char[n2];

        for(int i =0;i<n1;++i)
            L[i] = arr[l+i];
        for(int j=0;j<n2;++j)
            R[j] = arr[m+1+j];

        int i=0,j=0;
        int k =l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void mergeSort(char arr[] , int l , int r) {
        if(l<r) {
            int m = l + (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }
    static void printArray(char arr[]){
        int n = arr.length;
        for(int i=0;i<n;++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        String inputString = "geeksforgeeks";
        char arr[] = inputString.toCharArray();

        System.out.println("Given array is");
        printArray(arr);

        P02_Sort_String ob = new P02_Sort_String();
        ob.mergeSort(arr, 0, arr.length -1 );

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}
*/

/*Approach 2 - Using Sort() method */
 
import java.util.Arrays;
public class P02_Sort_String {
    public static String sortString(String inputString){
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args) {
        String inputString = "geeksforgeeks";
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);
    }
}
