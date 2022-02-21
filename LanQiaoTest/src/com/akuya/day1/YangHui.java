package com.akuya.day1;

import java.util.Scanner;

public class YangHui {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1||n>34){
			n=sc.nextInt();
		}
		sc.close();
		
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(j==0||j==i){
					arr[i][j]=1;
				}else{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
