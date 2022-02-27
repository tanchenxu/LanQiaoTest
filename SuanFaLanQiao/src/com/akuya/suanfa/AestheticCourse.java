package com.akuya.suanfa;

import java.util.Scanner;

public class AestheticCourse {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			arr[i][j]=scanner.nextInt();
		}
	}
	int back=0;
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			boolean flag=true;
			for(int x=0;x<m;x++){
				if(arr[i][x]==arr[j][x]){
					flag=false;
					break;
				}
			}
			if(flag){
				back++;
			}
		}
	}
	System.out.println(back);
}
}
