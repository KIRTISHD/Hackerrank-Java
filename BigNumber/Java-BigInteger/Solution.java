import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        in.close();

        java.math.BigInteger bi1 = new java.math.BigInteger(str1);
        java.math.BigInteger bi2 = new java.math.BigInteger(str2);
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));
    }
}
