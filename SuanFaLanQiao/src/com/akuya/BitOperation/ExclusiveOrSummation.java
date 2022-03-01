package com.akuya.BitOperation;

import java.util.Scanner;

public class ExclusiveOrSummation {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int sum=0;
	int num[]=new int[n];
	for(int i=0;i<n;i++){
		num[i]=scanner.nextInt();
	}
	for(int i=0;i<(1<<n);i++){
		int ans=0;
		for(int j=0;j<num.length;j++){
			if((i&(1<<j))!=0){
				ans^=num[j];
			}
		}
		sum+=ans;
	}
	System.out.println(sum);
	
}
 public static int power(int n) {
	 int temp=2;
	 int sum=1;
	 for(int i=1;i<=n;i++){
		 sum*=temp;
	 }
	return sum;
}
}
