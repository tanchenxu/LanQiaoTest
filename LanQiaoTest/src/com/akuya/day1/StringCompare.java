package com.akuya.day1;

import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String first=scanner.next();
	String next=scanner.next();
	if(first.length()!=next.length()){
		System.out.println("1");
		return;
	}
	if(first.equals(next)){
		System.out.println("2");
	}else if(first.equalsIgnoreCase(next)){
		System.out.println("3");
	}else{
		System.out.println("4");
	}
	
}
}
