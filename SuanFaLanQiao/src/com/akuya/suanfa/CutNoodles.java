package com.akuya.suanfa;

import java.util.Scanner;

public class CutNoodles {
 public static void main(String[] args) {
	/**
	 * 一根高筋拉面，中间切一刀，可以得到2根面条。

如果先对折1次，中间切一刀，可以得到3根面条。

如果连续对折2次，中间切一刀，可以得到5根面条。

那么，连续对折10次，中间切一刀，会得到多少面条呢？
	 */
	 Scanner scanner=new Scanner(System.in);
	 int n=scanner.nextInt();
	 System.out.println(power(n));
			 
}
 public static int power(int k) {
	 if(k==0){
		 return 2;
	 }
	 int total=1;
	 int temp=k;
	 for(int i=1;i<=k;i++){
		 total=total*2;
	 }
	 return total+1;
}
}
