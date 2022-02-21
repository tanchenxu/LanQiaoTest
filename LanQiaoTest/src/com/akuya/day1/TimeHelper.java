package com.akuya.day1;

import java.util.Scanner;

public class TimeHelper {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String little[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninetee", "twenty"};
	String large[]={"","","","","","","","","","","ten","","","","","","","","","","twenty","","","","","","","","","","thirty","","","","","","","","","","forty","","","","","","","","","","fifty"};
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	if(n<=20){
		System.out.print(little[n]+" ");
	}else{
		System.out.print(large[n/10*10]+" "+little[n%10]+" ");
	}
	if(m==0){
		System.out.print("o'clock");
		return;
	}
	if(m<=20){
		System.out.print(little[m]+" ");
	}else{
		System.out.print(large[m/10*10]+" "+little[m%10]);
	}
}
}
