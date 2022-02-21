package com.akuya.day1;

import java.util.Scanner;

public class CharOfFj {
	static char mom='A';
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	System.out.println(getFJ(n));

}

 public static String getFJ(int n){
	 if(n==1){
		 return "A";
	 }else{
		return getFJ(n-1)+(char)(mom+(n-1))+getFJ(n-1);
	 }
 }
}
