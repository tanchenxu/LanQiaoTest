package com.akuya.day1;

import java.util.Scanner;

public class HuiWen {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	while(n<1||n>54){
      n = sc.nextInt();
	}
	sc.close();
	
	
	for(int i=10000;i<99999;i++){
		if(i/10000==i%10){
			if(i/1000%10==i/10%10){
				if((i/10000+i%10+i/1000%10+i/100%10+i/10%10)==n){
					System.out.println(i);
				}
			}
		}
	}
	for(int i=100000;i<999999;i++){
		if(i/100000==i%10){
			if(i/10000%10==i/10%10){
				if(i/1000%10==i/100%10){
					if((i/100000+i%10+i/10000%10+i/10%10+i/1000%10+i/100%10)==n){
						System.out.println(i);
					}
				}
			}
		}
	}
}
}