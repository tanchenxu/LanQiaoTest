package com.akuya.day1;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class SineDance {
    static int N;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    N =scanner.nextInt();
		System.out.println(getSn(N));
	}
	
	public static String getAn(int n){
		if(n==1){
			return "sin(1";
		}else if(n%2==0){
			return getAn(n-1)+"-sin("+n;
		}else{
			return getAn(n-1)+"+sin("+n;
		}
	}
	
	public static String getEnd(int n) {
		String str ="";
		for(int i=0;i<n;i++){
			str+=")";
		}
		return str;
	}
	
	public static String getSn(int n) {
		if(n==1){
			return getAn(n)+getEnd(n)+"+"+(N+1-n);
		}else{
			return "("+getSn(n-1)+")"+getAn(n)+getEnd(n)+"+"+(N+1-n);
		}
	}
}
