import java.util.*;
public class sumSubsetProblem {
    public static int countSubset(int arr[],int n,int sum)
    {
        if(n==0)
        {
            return (sum==0) ? 1:0;
        }
        return countSubset(arr,n-1,sum) + countSubset(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sum=s.nextInt();
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int c=countSubset(arr,n,sum);
        System.out.println(c);
    }
}
// O(2^n)
