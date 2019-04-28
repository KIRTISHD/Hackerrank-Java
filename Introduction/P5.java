import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%s",s1);
                for(int j=0;j<15-s1.length();j++)
                    System.out.printf(" ");
                System.out.printf("%03d\n",x);
            }
            System.out.println("================================");

    }
}



