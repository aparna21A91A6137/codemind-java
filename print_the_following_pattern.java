import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        int t,i,j;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=t;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
        
    }
}