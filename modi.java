
import java.util.*;
import java.io.*;
class modi
{
    public static void main ()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int p=sc.nextInt();
        for(int i=1;i<=p;i++)
        {
            for(int k=p-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            System.out.print("*");
            }
                System.out.println();
        }
    }
}
