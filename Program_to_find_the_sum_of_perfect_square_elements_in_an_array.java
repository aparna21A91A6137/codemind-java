import java.util.Scanner;
class Sorted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=arr[i];j++)
            {
                if(j*j==arr[i])
                {
                    sum+=arr[i];
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}
