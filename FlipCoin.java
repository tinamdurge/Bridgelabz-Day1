import java.util.*;

public class FlipCoin
 {
	public static void main(String[] args) {
	int n;
	float pHead=0,pTail=0,hCount=0,tCount=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of times to flip coin");
	n = scan.nextInt();
	if(n>0)
	{
		for(int i=0;i<n;i++) {
		double coin = Math.floor((Math.random()*10)%2);
		System.out.println(coin);
		if(coin<0.5)
			hCount++;
		else
			tCount++;
	   }
		pHead = (hCount/n)*100;
		pTail = (tCount/n)*100;
		System.out.println("Percentage of head "+pHead);
		System.out.println("Percentage of tail "+pTail);
	}
	}

	
}