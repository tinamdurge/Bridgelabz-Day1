package com.basic_core;

import java.util.Scanner;

public class CoinFlip {
	public void calculate() {
	int num;
	float percentHead=0,percentTail=0,headCount=0,tailCount=0;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the no of times to flip coin");
	num = s1.nextInt();
	if(num>0)
	{
		for(int i=0;i<num;i++) {
		double coin = Math.floor((Math.random()*10)%2);
		System.out.println(coin);
		if(coin<0.5)
			headCount++;
		else
			tailCount++;
	   }
		percentHead = (headCount/num)*100;
		percentTail = (tailCount/num)*100;
		System.out.println("Percentage of head "+percentHead);
		System.out.println("Percentage of tail "+percentTail);
	}
	
}

	
}