import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int totalLength = A.length() + B.length();
        String comp = (A.compareTo(B) > 0) ? "Yes" : "No";
        String Amod = A.substring(0,1).toUpperCase() + A.substring(1);
        String Bmod = B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(totalLength);
        System.out.println(comp);
        System.out.println(Amod + " " + Bmod);
    }
}



