import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        int y=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int odd=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2!=0)
                {
                    odd+=1;
                }
            }
            int k=odd/2;
            System.out.println(k);
        }
    }
}