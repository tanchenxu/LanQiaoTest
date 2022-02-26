package com.akuya.suanfa;

import java.awt.Checkbox;
import java.util.Scanner;

public class HousePlateMaking {
	static int num=0;
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int n=scanner.nextInt();
	for(int i=1;i<=n;i++){
		check(i);
	}
	System.out.println(num);
}

public static void check(int n) {
	while(n>0){
		int t=n%10;
		if(t==2){
			num++;
		}
		n=n/10;
	}
	
}
}
