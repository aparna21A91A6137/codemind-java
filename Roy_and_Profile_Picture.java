import java.util.Scanner;
import java.lang.Math;
class Minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        while(n>0)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(w<l || h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(w==h)
            {
                System.out.println("ACCEPTED");
            }
            else if(w==l && h==l)
            {
                System.out.println("ACCEPTED");
            }
            else if(w>l || h>l)
            {
                System.out.println("CROP IT");
            }
            n--;
        }
    }
}
