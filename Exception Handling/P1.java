import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println(e.getClass().getName()+": " + e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
        }
    }
}

