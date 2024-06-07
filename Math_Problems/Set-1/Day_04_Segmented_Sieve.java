//Implement a java program 

import java.util.*;
import java.util.Vector;
import static java.lang.Math.sqrt;
import static java.lang.Math.toRadians;
import static java.lang.Math.floor;
import static java.lang.Math.nextUp;

public class Day_04_Segmented_Sieve {
    static void simplesieve(int limit, Vector<Integer> prime) {
        boolean mark[] = new boolean[limit+1];
        for(int i =0;i<mark.length;i++)
            mark[i] = true;

        for(int p = 2;p*p<limit;p++) {
            if(mark[p]==true) {
                for(int i = p*p;i<limit;i+=p)
                    mark[i] = false;
            }
        }
        for(int p =2;p<limit;p++) {
            if(mark[p] == true) {
                prime.add(p);
                System.out.println(p + " ");
            }
        }
    }
    static void segmentedSieve(int n) {
        int limit = (int)(floor(sqrt(n))+1);
        Vector<Integer> prime = new Vector<>();
        simplesieve(limit,prime);

        int low = limit;
        int high = 2*limit;

        while(low < n) {
            if(high >= n)
               high = n;

            boolean mark[] = new boolean[limit+1];
            for(int i = 0;i<mark.length;i++) 
                mark[i] = true;

            for(int i =0;i<prime.size();i++) {
                int loLim = (int)(floor(low/prime.get(i)));
                if(loLim < low)
                   loLim += prime.get(i);

                for(int j = loLim;j<high;j+=prime.get(i))
                    mark[i-low] = false;
            }
            for(int i = low ;i<high;i++)
                if(mark[i - low]==true)
                   System.out.print(i + " ");

            low = low + limit;
            high = high + limit;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Primes smaller than " + n + ":");
        segmentedSieve(n);
    }

}
