import java.util.*;
public class sumOfNaturalNo {
    static int sum(int num)
    {
        if(num==0)      // base case.
        {
            return 0;
        }

        return num + sum(num-1);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int c = sum(num);
        System.out.println(c);
    }
}
