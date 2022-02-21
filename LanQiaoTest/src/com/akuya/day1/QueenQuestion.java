package com.akuya.day1;

import java.util.Scanner;
public class QueenQuestion {
   static int[][] board;
   static int n;
   static int sum;
   public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	n=scanner.nextInt();
	board =new int[n][n];
	sum=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			board[i][j]=scanner.nextInt();
		}
	}
	backtrack(0);
	System.out.println(sum);
	}
   
   public static void backtrack(int a){
	   if(a==2*n){
		   sum++;
		   return;
	   }
	   int bj=0;
	   if(a<n){
		   bj=2;
	   }else{
		   bj=3;
	   }
	   for(int i=0;i<n;i++){
		   if(isOK(a, i)){
			   board[a%n][i]=bj;
			   backtrack(a+1);
			   board[a%n][i]=1;
		   }
	   }
	   return;
   }
   
   public static boolean isOK(int a,int site){
	   if(board[a%n][site]!=1){
		   return false;
	   }
	   int bj=0;
	   if (a<n){
           bj=2;
       }else {
           bj=3;
       }
	   for(int j=0;j<a%n;j++){
		   if(board[j][site]==bj){
			   return false;
		   }
	   }
	   for(int s=site-1,w=a%n-1;s>=0&&w>=0;s--,w--){
		   if(board[w][s]==bj){
			   return false;
		   }
	   }
	   for(int s=site+1,w=a%n-1;s<n&&w>=0;s++,w--){
		   if(board[w][s]==bj){
			   return false;
		   }
	   }
	   return true;
   }
}
