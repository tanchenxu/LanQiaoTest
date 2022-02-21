package com.akuya.day1;

import java.util.Scanner;

public class Matrix {
public static void main(String[] args) {
	
 Scanner scanner=new Scanner(System.in);
 int n=scanner.nextInt();
 int m=scanner.nextInt();
 int arr[][]=new int[n][n];
 int temp[][]=new int[n][n];
 for(int i=0;i<n;i++){
	 for(int j=0;j<n;j++){
		 arr[i][j]=scanner.nextInt();
		 temp[i][j]=arr[i][j];
	 }
 }
if(m==0){
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i!=j){
				arr[i][j]=0;
			}else{
				arr[i][j]=1;
			}
		}
	}
	 for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	return;
}
 
 for(int i=1;i<m;i++){
	 int temp1[][]=new int[n][n];
	 for(int j=0;j<n;j++){
		 for(int t=0;t<n;t++){
			 for(int g=0;g<n;g++){
				 temp1[j][t]+=temp[j][g]*arr[g][t];
			 }
				
			 }
		 }
	 for(int s=0;s<n;s++){
		 for(int k=0;k<n;k++){
			 temp[s][k]=temp1[s][k];
		 }
	 }
	 }
 for(int i=0;i<n;i++){
	 for(int j=0;j<n;j++){
		 System.out.print(temp[i][j]+" ");
	 }
	 System.out.println();
 }
}
}