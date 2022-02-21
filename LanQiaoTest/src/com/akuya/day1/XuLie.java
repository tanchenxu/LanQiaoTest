package com.akuya.day1;

import java.util.Scanner;

public class XuLie {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n =scanner.nextInt();
	long total=0;
	for (int i=1;i<=n;i++){
		total+=i;
	}
	System.out.println(total);
}
}
