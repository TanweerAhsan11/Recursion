import java.util.Scanner;
public class palindrome {

    public static boolean isPalindrome(String str,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        return(str.charAt(start) == str.charAt(end)) && isPalindrome(str,start+1,end-1);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int start =0;
        String str=s.nextLine();
        int end=str.length()-1;
        boolean c=isPalindrome(str,start,end);
        System.out.println(c);
    }
}

// O(n)     T(n)=T(n-2)+1
