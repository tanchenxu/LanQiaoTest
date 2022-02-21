package com.akuya.day1;

import java.util.MissingFormatArgumentException;

public class ZeroOne {
public static void main(String[] args) {
	for(int i=0;i<32;i++){
		String temp=Integer.toBinaryString(i);
		int temp2=Integer.parseInt(temp);
		System.out.printf("%05d\n",temp2);
	}
}
}
