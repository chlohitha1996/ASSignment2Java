import java.util.Scanner;
import java.lang.Exception;


public class Average {
    static  int compute(int a[],int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+a[i];
        }
        return sum/n;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        int[] b=new int[100];
        System.out.println("Enter the number of students");

        n=s.nextInt();
        if(n<0 || n>101)
        {
            System.out.print("Enter Valid number of students");
            System.exit(0);
        }
        System.out.println("Maximum marks can be 100");
        try{
        for(int i=1;i<=n;i++)
        {


            System.out.println("Enter the marks  of  the student"+i+":");
            b[i]=s.nextInt();

                if (b[i] < 0 || b[i] > 101) {
                    System.out.print("Enter Valid Marks");
                    System.exit(0);
                }
            }
        }
        catch(Exception e){
            System.out.println("Enter only Valid Values");
            System.exit(0);
    }

        System.out.println("The average "+compute(b,n));
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(b[j]>b[j+1])
                {
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;

                }
            }
        }
        System.out.println("The minimum is "+b[1]);
        System.out.println("the maximum is "+b[n]);

    }
}