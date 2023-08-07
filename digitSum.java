import java.util.*;
public class digitSum {
    public static int getsum(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        else
        {
            return getsum(num/10) + num%10;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        getsum(num);
        System.out.println(getsum(num));

    }
}

// TC = O(d) = SC        where d is the number of digit.
