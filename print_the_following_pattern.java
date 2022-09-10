import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        int t,i,j;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            for(j=t;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}