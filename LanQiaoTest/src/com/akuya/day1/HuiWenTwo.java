package com.akuya.day1;

import java.util.Scanner;

public class HuiWenTwo {

	public static void main(String[] args) {
		for(int i=1000;i<=9999;i++){
			if(i/1000==i%10){
				if(i/100%10==i/10%10){
					System.out.println(i);
				}
			}
		}
	}
}
