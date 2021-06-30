import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        
        double b=scan.nextDouble();
        scan.nextLine();
        String c=scan.nextLine();
        a=a+i;
        b=b+d;
        c=s+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        

        scan.close();
    }
}