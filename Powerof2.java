import java.util.*;

public class Powerof2
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
        	int n=scan.nextInt();
        	System.out.println("Power of 2^"+n+" is: "+(Math.pow(2, n)));
        	System.out.println();
       		System.out.println("Printing all till Power Value "+n);

        for(int i=1;i<=n;i++)
        {
         	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));
        }
	}
}
