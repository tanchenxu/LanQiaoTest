package com.akuya.BitOperation;

import java.util.Scanner;

public class SumOfTwoNumbers {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	System.out.println(getSum(n, m));
}
public static int getSum (int a,int b) {
	return b==0 ? a : getSum(a^b, (a&b)<<1);
	
}
}
