import java.util.Scanner;

public class Palindrome{
    public static void  palindromeCheck(String s) {

        String rev = new StringBuffer(s).reverse().toString();


        if (rev.equals(s)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }

    }
    public static void main (String[] args)  throws java.lang.Exception
    {
        System.out.println("Enter a String");

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        palindromeCheck(s);
    }
}
