package com.akuya.day1;

import java.util.Scanner;

class Litter {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			char s = (char)(Math.abs(i-j)+'A');
			System.out.print(s);
		}
		System.out.println();
	}
}
}
