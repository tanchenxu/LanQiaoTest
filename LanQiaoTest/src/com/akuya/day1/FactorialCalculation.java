package com.akuya.day1;

import java.util.Arrays;
import java.util.Scanner;

public class FactorialCalculation {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int arr[]=new int[5000];
	arr[0]=1;
	for(int i=2;i<=n;i++){
		int r=0;
		for(int j=0;j<arr.length;j++){
			int temp=arr[j]*i+r;
			r=temp/10;
			arr[j]=temp%10;
		}
	}
	while(arr[arr.length-1]==0){
	arr=Arrays.copyOfRange(arr, 0,arr.length-1);
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[arr.length-1-i]);
	}
}
}
