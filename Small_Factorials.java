import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a>0)
        {
            int n=sc.nextInt();
            int prod=1;
            for(int i=1;i<=n;i++)
            {
                prod=prod*i;
            }
            System.out.println(prod);
            a--;
        }
    }
}
