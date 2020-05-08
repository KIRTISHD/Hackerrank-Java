import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s == null || s.equals("") || s.trim().equals(""))
        {
            System.out.println("0");
            return;
        }
        /*if (s.length() == 0){
            System.out.println("0");
            return;
        }*/
        if (s.length() > 400000){
            return;
        }
        //one case contains only spaces
        String[] arr = s.trim().split("[ !,?._'@]+");
        System.out.println(arr.length);
        for(String temp : arr)
            System.out.println(temp);
        scan.close();
    }
}

