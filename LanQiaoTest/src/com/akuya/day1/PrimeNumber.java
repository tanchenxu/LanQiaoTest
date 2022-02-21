package com.akuya.day1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		for(int i=n;i<=m;i++){
			/*if(isPrime(i)){
			System.out.println(i+"="+i);
			}else{
				int t=2;
				if()*/
			System.out.print(i+"=");
			int k=2;
			int s=i;
			while(k<=s){ 
				if(s == k){
					System.out.println(s);
					break; 
				}
				else if(s%k == 0){
					System.out.print(k + "*");
					s = s/k;
				}
				else{
					k++; 
				}
				}
		
			
			}
		}
	
	

public static boolean isPrime(int n) {
	boolean flag=true;
	if(n==1){
		flag=false;
		return flag;
	}
	if(n==2){
		return flag;
	}
	for(int i=2;i<=n/2;i++){
		if(n%i==0){
			flag=false;
			return flag;
		}
	}
	return flag;
}
}
