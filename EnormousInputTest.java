import java.util.*;

class solution{
    public static void main (String[] args) {
         int c=0;
        
        Scanner sc= new Scanner(System.in);
        String sen=sc.nextLine();
        String[] arrof=sen.split(" ", 2);
       int n1=Integer.parseInt(arrof[0]);
       int n2=Integer.parseInt(arrof[1]);
        for(int i=0; i<n1 ; i++)
        { 
        int arr[];
        arr=new int[20];
        arr[i]=sc.nextInt();
        if(arr[i]%n2==0)
        c+=1;
        }
    System.out.println(c);
    }
}
