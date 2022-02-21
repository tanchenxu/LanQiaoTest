package com.akuya.day1;

import java.util.Scanner;

public class SixteenToTen {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		long result=Long.parseLong(s,16);
		System.out.println(result);
	}
}
