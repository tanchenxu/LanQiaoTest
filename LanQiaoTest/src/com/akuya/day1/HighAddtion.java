package com.akuya.day1;

import java.security.spec.ECPrivateKeySpec;
import java.util.Arrays;
import java.util.Scanner;

public class HighAddtion {
	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
String stra=new String();
String strb=new String();
stra=scanner.nextLine();
strb=scanner.nextLine();
int a[]=new int[stra.length()];
int b[]=new int[strb.length()];

for(int i=0;i<stra.length();i++){
	a[a.length-1-i]=(stra.charAt(i)-48);
}
for(int i=0;i<strb.length();i++){
	b[b.length-1-i]=(strb.charAt(i)-48);
}

int maxlen=a.length>b.length?(a.length):(b.length);
int c[]=new int[maxlen+1];
int minlen=a.length<b.length?a.length:b.length;

int r=0;
for(int i=0;i<minlen;i++){
	int temp=a[i]+b[i]+r;
	r=temp/10;
	c[i]=temp%10;
}
if(a.length>b.length){
	for(int i=b.length;i<maxlen;i++){
		int temp=a[i]+r;
		r=temp/10;
		c[i]=temp%10;
	}
}else if(a.length<b.length){
	for(int i=a.length;i<maxlen;i++){
		int temp=b[i]+r;
		r=temp/10;
		c[i]=temp%10;
	}
}
if(r!=0){
	c[c.length-1]+=r;
}
if(c[c.length-1]==0){
	c=Arrays.copyOfRange(c, 0, c.length-1);
}
for(int i=0;i<c.length;i++){
	System.out.print(c[c.length-1-i]);
}
	}
}
