import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] a=new int[T];
        for(int i=0;i<T;i++)
        a[i]=sc.nextInt();
        for(int i=T-1;i>=0;i--)
        System.out.print(a[i]+" ");
        
    }
    
}
