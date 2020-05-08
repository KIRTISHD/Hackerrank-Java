import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] arr = A.toCharArray();

        for(int i = 0, k = A.length()-1; k>i; i++,k--)
        {
            if (arr[i] != arr[k])
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }
}



