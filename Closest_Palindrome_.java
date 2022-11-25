import java.util.*;
class Solution
{
    static boolean pal(int n)
    {
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int left=0,right=0;
        for(int i=n-1;i>=0;i--)
        {
            if(pal(i))
            {
                left=i;
                break;
            }
        }
        for(int i=n+1;i<=10000;i++)
        {
            if(pal(i))
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
            System.out.print(left+" "+right);
        }
       
    }
}