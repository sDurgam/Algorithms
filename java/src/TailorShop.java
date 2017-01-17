import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TailorShop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        int count = 0;
        long sum = 0l;
        List<Integer> used = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int a_i=0; a_i < n; a_i++)
        {
            count = a[a_i]/p;
            if(a[a_i] % p != 0)
            {
                count = count + 1;
            }
            if(used.contains(count))
            {
                count = used.get(used.size() - 1) + 1;
            }
            used.add(count);
            sum += count;
        }
        System.out.println(sum);
        // your code goes here
    }
}
