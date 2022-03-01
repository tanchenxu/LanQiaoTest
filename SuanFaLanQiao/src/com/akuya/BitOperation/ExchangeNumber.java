package com.akuya.BitOperation;

import java.util.Scanner;

public class ExchangeNumber {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	System.out.println(n);
	System.out.println(m);
	n=n^m;
	m=n^m;
	n=n^m;
	System.out.println("**********************");
	System.out.println(n);
	System.out.println(m);
	
	
}
}
