import java.util.Scanner;
class max
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
        int count=0,minn=0,maxx=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                minn=i;
            }
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxx=i;
            }
        }
        if(minn<maxx)
        {
            for(int i=minn;i<=maxx;i++)
            {
                if(prime(arr[i]))
                {
                    count++;
                }
            }
        }
        else
        {
            for(int i=maxx;i<=minn;i++)
            {
                if(prime(arr[i]))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
