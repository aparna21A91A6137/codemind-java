import java.util.Scanner;
class Pattern
{
    static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int y=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int temp=n;
            int left=0,right=0;
            for(int i=n;i>=2;i--)
            {
                if(prime(i))
                {
                    left=i;
                    break;
                }
            }
            for(int i=n;i<10000;i++)
            {
                if(prime(i))
                {
                    right=i;
                    break;
                }
            }
            int c=temp-left;
            int d=right-temp;
            if(c<d)
            {
                System.out.println(left);
            }
            else if(d<c)
            {
                System.out.println(right);
            }
            else
            {
                if(left<right)
                {
                    System.out.println(left);
                }
                else
                {
                    System.out.println(right);
                }
            }
        }
    }
}