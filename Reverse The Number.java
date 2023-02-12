import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef2{

        static class Reader 
        {
            int n,r;
        Scanner sc= new Scanner(System.in);
        
       int t=sc.nextInt();
        for(inti=0 ; i<t ; i++)
        {
            n=sc.nextInt();
            while(n>0)
            {
             r=n%10;
             n=n/10;
            System.out.println(r);
