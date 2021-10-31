import java.util.*;
import java.io.*;
class armstrong
{
    public static void main ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        int s=0;
        int p=n;
        int x=n;
        int l=0;
        while (p>0)
        {
            l++;
            p=p/10;
        }
        while (x>0)
        {
            int d=x%10;
            int r=1;
            for (int i=1; i<=l; i++)
            {
                r=r*d;
            }
            s=s+r;
            x=x/10;
        }
        if (s==n)
        {
            System.out.println("armstrong");
        }
        else
        System.out.println("not armstrong");
    }
}
