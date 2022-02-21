package com.akuya.day1;

import java.util.Scanner;

public class Circle {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	double area=n*n*(Math.PI);
	System.out.println(String.format("%.7f",area));
}
}
