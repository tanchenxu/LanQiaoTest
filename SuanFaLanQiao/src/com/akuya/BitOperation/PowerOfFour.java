package com.akuya.BitOperation;

import java.util.Scanner;

public class PowerOfFour {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	if((n>0)&&((n&(n-1))==0)&&((n%3)==1)){
		System.out.println("true");
	}else{
		System.out.println("false");
	}
}
}
