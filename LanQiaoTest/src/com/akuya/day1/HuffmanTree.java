package com.akuya.day1;

import java.util.Arrays;
import java.util.Scanner;

public class HuffmanTree {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int arr[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++){
		arr[i]=scanner.nextInt();
	}
	int arr1[]=new int [n-1];
	Arrays.sort(arr);
	for(int i=0;i<n-1;i++){
		arr1[i]=arr[i]+arr[i+1];
		arr[i]=0;
		arr[i+1]=arr1[i];
		Arrays.sort(arr);
	}
	for(int i=0;i<n-1;i++){
		sum+=arr1[i];
	}
	System.out.println(sum);
}
}
