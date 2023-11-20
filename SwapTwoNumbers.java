import java.util.*;
 class SwapTwoNumbers
{
	public static void main(String[] args)
	{
		int a,b,result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
	        a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Before swapping:"+a+" " +b);
		result=a;
		a=b;
		b=result;
		System.out.println("After swapping:"+a+ " " +b);
		
	}
}