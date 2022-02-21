package com.akuya.day1;

public class SpecialNunber {
	public static void main(String[] args) {
		
		for(int i=100;i<=999;i++){
			if((i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10)==i){
				System.out.println(i);
			}
		}
	}

}
