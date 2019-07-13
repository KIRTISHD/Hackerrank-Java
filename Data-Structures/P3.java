import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        for (int i=0; i<n; i++){
            int s=arr[i];
            if (s<0){
                count++;
            }
            for (int j=i+1; j<n; j++){
                s = s+arr[j];
                if (s < 0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

