package com.akuya.BitOperation;

import java.util.Scanner;

public class AlternateBinary {
 public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 int n=scanner.nextInt();
	 boolean flag=true;
	 while(n!=0){
		 if(((n&3)==0)||((n&0)==3)){
			 flag=false;
		 } 
	 }
	 if(flag){
		 System.out.println("yes");
	 }else{
		 System.out.println("no");
	 }
}
}
