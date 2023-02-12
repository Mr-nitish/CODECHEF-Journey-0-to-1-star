import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) throws Exception{
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       float y=sc.nextFloat();
        if(x%5==0 && y>=x+0.5f)
        System.out.println(y-x-0.5f);
        
        else{
            System.out.println(y);
        }
        
    }
}
