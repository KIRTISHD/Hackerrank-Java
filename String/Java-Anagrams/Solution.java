import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int len1 = a.length();
        int len2 = b.length();
        
        if (len1 != len2)
            return false;
            
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        java.util.HashMap<Character, Integer> map1 = new java.util.HashMap<Character, Integer>();
        for(Character c : a.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        java.util.HashMap<Character, Integer> map2 = new java.util.HashMap<Character, Integer>();
        for(Character c : b.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }

  public static void main(String[] args) {
