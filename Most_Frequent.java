import java.util.Scanner;
class Frequent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int m=0;
        int sum=0,k=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            if(arr[i]==-1)
            {
                continue;
            }
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>m)
            {
               m=count;
               sum=arr[i];
            }
            else if(count==m && arr[i]<sum)
            {
                sum=arr[i];
                arr[i]=-1;
            }
        }
        System.out.println(sum);
        
    }
}