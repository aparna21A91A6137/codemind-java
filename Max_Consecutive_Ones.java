import java.util.Scanner;
class Max
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
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            //System.out.println(arr[i]);
            int count=0;
            if(arr[i]==1)
            {
                for(int j=i;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                    else
                    {
                        break;
                    }
                }
                if(count>max)
                {
                    max=count;
                }
            }
            
        }
        System.out.print(max);
    }
}