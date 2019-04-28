import java.util.*;
import java.io.*;

class Solution{
    public static void calc(int a,int b,int n){
        int x = a+((int)Math.pow(2,0)*b);
        System.out.print(x+" ");
        for(int i=1;i<n;i++){
            x=x+((int)Math.pow(2,i)*b);
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calc(a,b,n);
        }
        in.close();
    }
}
