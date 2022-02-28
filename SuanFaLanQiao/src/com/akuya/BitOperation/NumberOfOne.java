package com.akuya.BitOperation;

import java.util.Scanner;

public class NumberOfOne {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int num=0;
		while(n!=0){
			n&=(n-1);
			num++;
		}
		System.out.println(n);
	}
}
