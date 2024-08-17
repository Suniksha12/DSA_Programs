/*Implement a code in java in which we have to perform selcetion sort.
 * 
 * Input : {64,25,12,22,11};
 * Output : 11 , 12 , 22 , 25 , 64
 * 
 * Time Complexity : O(N^2)
 * Space Complexity : O(!)
 */

public class P10_selection_sort {
    void sort(int arr[]){
        int n = arr.length;

         for (int i =0;i<n-1;i++) {
            int min_indx = i;
            for(int j = i+1;j<n;j++)
                if(arr[j]<arr[min_indx])
                   min_indx = j;

            int temp = arr[min_indx];
            arr[min_indx] = arr[i];
            arr[i] = temp;
            }
         }
         void printArray(int arr[]){
            int n = arr.length;
            for(int i =0;i<n;++i)
               System.out.print(arr[i] + " ");
            System.out.println();
         }
        public static void main(String args[]){
            P10_selection_sort ob = new P10_selection_sort();
            int arr[] = {64,25,12,22,11};
            ob.sort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
    }
}
