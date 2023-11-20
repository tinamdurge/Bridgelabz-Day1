import java.util.*;
public class HarmonicNumber
{
public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("The Harmonic Series is: ");
        double result = 0.0;
        while(n > 0)
          {
               result = result + (double) 1 / n;
               n--;
               System.out.println(result +"  ");
          }
        System.out.println("Output of Harmonic Series is "+result);
    }
} 