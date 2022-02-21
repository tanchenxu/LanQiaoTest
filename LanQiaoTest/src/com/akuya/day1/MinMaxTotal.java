package com.akuya.day1;

import java.util.Scanner;

public class MinMaxTotal {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]= new int [n];
		for(int i =0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		int total=0;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
			total+=arr[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(total);
	}
}