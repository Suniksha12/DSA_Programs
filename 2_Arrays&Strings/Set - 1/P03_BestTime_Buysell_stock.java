//Implement Code in Java

/* The cost of a stock on each day is given in an array. Find the maximum profit that you can make by buying and selling on those days. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.

Examples:

Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865 

Approach 1 : Common Approach*/

/*import java.util.Scanner;

public class P03_BestTime_Buysell_stock {
    static int maxprofit(int price[], int start , int end) {
        if(end <= start)
           return 0;
        int profit =0;
        for(int i =start ; i<end;i++) {
            for(int j = i+1;j<=end;j++) {
                if(price[j] > price[i]) {
                    int curr_profit = price[j]-price[i] + maxprofit(price, start, i-1) + maxprofit(price, j+1, end);
                    profit = Math.max(profit, curr_profit);
                }
            }

        }
        return profit;
    }
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the price:");
    int price[] = new int[7];
    int n = price.length;
    for(int i =0;i<n;i++) {
        price[i] = in.nextInt();
    }
    System.out.print(maxprofit(price, 0, n-1));
    in.close();
   }
} */

/*Approach 2 : Using Local Maxima and Local Minima 
 * Time complexity : O(n)
 * Space Complexity : O(1)
*/

/* import java.util.*;
class Interval {
    int buy, sell;
}
public class P03_BestTime_Buysell_stock {
    static void stockBuySell(int price[] , int n) {
        if(n==1)
           return;
        int count =0;
        ArrayList<Interval> sol = new ArrayList<Interval>();

        int i =0;
        while(i < n-1) {
            while ((i < n - 1)
                   && (price[i + 1] <= price[i]))
                i++;
            
            if(i == n-1) 
               break;
            
            Interval e = new Interval();
            e.buy = i++;

            while ((i < n) && (price[i] >= price[i - 1]))
                i++;

            e.sell = i-1;
            sol.add(e);

            count++;
        }
        if (count == 0)
            System.out.println(
                "There is no day when buying the stock "
                + "will make profit");
        else
            for (int j = 0; j < count; j++)
                System.out.println(
                    "Buy on day: " + sol.get(j).buy
                    + "        "
                    + "Sell on day : " + sol.get(j).sell);

        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter stock items: ");
        int price[] = new int[7];
        int n = price.length;
        for(int i =0;i<n;i++) {
            price[i] = in.nextInt();
        }
        stockBuySell(price,n);
        in.close();
    }
}
*/

/* Approach - 3 using Valley Peak Approach 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
*/

import java.util.*;
public class P03_BestTime_Buysell_stock {
    static int maxprofit(int prices[], int size) {
        int maxProfit =0;
        for(int i =1;i<size;i++) 
            if(prices[i] > prices[i-1])
               maxProfit += prices[i] - prices[i-1];
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price:");
        int price[] = new int[6];
        int n = price.length;
        for(int i =0;i<n;i++) {
            price[i] = in.nextInt();
        }
        System.out.print(maxprofit(price, n));
        in.close();
    }
}