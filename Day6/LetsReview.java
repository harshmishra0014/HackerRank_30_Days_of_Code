import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        String s;
        for(int i=1;i<=T;i++)
        {

            s=sc.nextLine();
            for(int j=0;j<s.length();j++)
            {
                if(j%2==0)
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for(int j=1;j<s.length();j++)
            {
                if(j%2!=0)
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        
        
    }
}