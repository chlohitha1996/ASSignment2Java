import java.util.Scanner;

class PowerFour{


    static int powerFour(int n)
    {
        if(n == 0)
            return 0;
        while(n != 1)
        {
            if(n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }


    public static void main(String[] args)
    {

        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();


        if(powerFour(num) == 1)
            System.out.println(num +  " is a power of 4");
        else System.out.println(new StringBuilder().append(num).append(" is not a power of 4").toString());
    }
}