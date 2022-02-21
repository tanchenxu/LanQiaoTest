package com.akuya.day1;

import java.util.Scanner;

public class RunYear {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	if(n%400==0||(n%4==0)&&(n%100!=0)){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
}
}
