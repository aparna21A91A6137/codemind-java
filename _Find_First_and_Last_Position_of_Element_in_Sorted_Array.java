import java.util.Scanner;
class Position
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                y=1;
                System.out.print(i+" ");
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==k)
            {
                y=1;
                System.out.print(i+" ");
                break;
            }
        }
        if(y==0)
        {
            System.out.print("-1 -1");
        }
    }
}
