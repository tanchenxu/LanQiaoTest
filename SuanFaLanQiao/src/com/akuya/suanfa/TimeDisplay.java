package com.akuya.suanfa;

import java.util.Scanner;

public class TimeDisplay {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    long n=scanner.nextLong();
    n=n/1000;
    int temp=(int)n%3600;
    int h=(int)n/3600%24;
    int m=temp/60;
    int s=temp%60;
    if(h<10){
    System.out.print("0"+h+":");
    }else{
    	System.out.print(h+":");
    }
    if(m<10){
    	System.out.print("0"+m+":");
    }else{
    	System.out.print(m+":");
    }
    if(s<10){
    	System.out.print("0"+s);
    }else{
    	System.out.print(s);
    }
    }
}
