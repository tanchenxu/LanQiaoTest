package com.akuya.DP;

import java.util.Scanner;

public class CoinExchange {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int money=scanner.nextInt();
		int coins[]=new int[n];
		for(int i=0;i<n;i++){
			coins[i]=scanner.nextInt();
		}
		System.out.println(choose(coins, n, money));
		}
	public static int choose(int []coins,int n,int money) {
		int mery[]=new int[money+1];
		for(int i=1;i<money+1;i++){
			mery[i]=1000;
		}
		mery[0]=0;
		for(int i=1;i<=money;i++){
			int temp[]=new int[n];
			boolean flag=false;
			for(int j=0;j<n;j++){
				
				temp[j]=i-coins[j];
				if(temp[j]>=0){
					flag=true;
				}
				if(temp[j]<0){
				    temp[j]=money;
				}
			}
			/*if(flag==false){
				return -1;
			}*/
			mery[i]=min(n, temp, mery)+1;
		}
		if(mery[money]<1000){
		return mery[money];
		}else{
			return -1;
		}
	}

	public static int min(int n,int temp[],int mery[]) {
		int min=mery[temp[0]];
		for(int i=1;i<n;i++){
			if(mery[temp[i]]<min){
				min=mery[temp[i]];
			}
		}
		
		return min;
	}
}
