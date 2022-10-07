import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,y=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            count=0;
            int k=arr[i];
            while(k!=0)
            {
                k=k/10;
                count+=1;
            }
            if(count%2==0)
            {
                y++;
            }
        }
        System.out.print(y);
    }
}