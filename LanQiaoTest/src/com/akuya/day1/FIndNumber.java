package com.akuya.day1;

import java.util.Scanner;

public class FIndNumber {
	
public static void main(String[] args) {
	
	Scanner scanner =new Scanner(System.in);
	int n=scanner.nextInt();
	int arr[]=new int[n];
	
	
	for(int i=0;i<n;i++){
		arr[i]=scanner.nextInt();
	}
	int temp;

	temp=scanner.nextInt();

	
	for(int i=0;i<n;i++){
		if(arr[i]==temp){
			System.out.println(i+1);
			return;
		}
		
	}
	System.out.println(-1);
}
}
