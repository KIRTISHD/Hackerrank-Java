import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int len = s.length();
        if (len < k)
        {
            smallest = s;
            largest = s;
            return smallest + "\n" + largest;
        }

        java.util.List<String> list = new java.util.ArrayList<String>();
        //java.util.TreeSet<String> set = new java.util.TreeSet<String>();
        
        for (int i = 0 ; i+k-1 < len ; i++) {
            list.add(s.substring(i, i+k));
            //set.add(s.substring(i, i+k));
        }
        java.util.Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size()-1);

        //smallest = set.first();
        //largest = set.last();
        
        return smallest + "\n" + largest;
    }

