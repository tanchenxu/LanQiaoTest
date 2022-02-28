package com.akuya.BitOperation;

import java.util.Scanner;

public class PowerOfTwo {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	if((n>0)&&((n&(n-1))==0)){
		System.out.println("true");
	}else{
		System.out.println("false");
	}
}
}
