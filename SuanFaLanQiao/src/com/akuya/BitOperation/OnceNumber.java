package com.akuya.BitOperation;

import java.util.Scanner;

public class OnceNumber {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int arr[]=new int[n];
	int result=0;
	for(int i=0;i<n;i++){
		arr[i]=scanner.nextInt();
		result^=arr[i];
	}
			System.out.println(result);
}
}
