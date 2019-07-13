import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br= new BufferedReader(new InputStreamReader((System.in)));
        
        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> a = new ArrayList<List<Integer>>(n);
        
        for(int i=0; i<n; i++) {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int tcount=0;
            a.add(new ArrayList<Integer>(temp[tcount]));
            int x = temp[tcount++];
            for(int j=0; j<x; j++) {
                a.get(i).add(temp[tcount++]);
            }
        }
        
        int query = Integer.parseInt(br.readLine());
        for(int i=0; i<query; i++) {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = temp[0];
            int y = temp[1];
            try {
                System.out.println(a.get(x-1).get(y-1));
            }catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}

