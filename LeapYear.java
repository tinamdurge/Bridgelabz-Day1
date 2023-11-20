import java.util.Scanner;
class LeapYear
 {
 public static void main(String[] args) 
{
 Scanner scan = new Scanner(System.in);
 System.out.println("Determine if it is a leap year or not");
  int year = scan.nextInt();
        if (year>=1000 && year<=9999)
        {
        	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
            {                                                                      
                System.out.println("Leap Year");
            }
                else
            {
                System.out.println("Not a Leap Year");
            }
	}
        
    }
}