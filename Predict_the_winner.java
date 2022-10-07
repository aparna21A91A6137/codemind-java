import java.util.Scanner;
import java.lang.Math;
class Player
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even+=arr[i];
            }
            else
            {
                odd+=arr[i];
            }
        }
        int diff=Math.abs(even-odd);
        if(diff%4==0)
        {
            System.out.print("X");
        }
        else
        {
            System.out.print("Y");
        }
    }
}