package com.akuya.BitOperation;

import java.util.Scanner;

public class HammingDistance {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	int temp=n^m;
	int num=0;
	while(temp!=0){
		temp&=(temp-1);
		num++;
	}
	System.out.println(num);
}
}
