package com.akuya.day1;

import java.util.Scanner;

public class PerfectCost {

	
	public static boolean IsPalindrome(String s){
		boolean ans=true;
		int temp=0;
		int letter[]=new int[26];
		for(int i=0;i<s.length();i++){
			letter[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++){
			if(letter[i]%2==1){
				temp++;
			}
		}
		if(temp<=1){
			return ans;
		}else{
			ans=false;
			return ans;
		}
	}
	
	public static int Times(String s){
		if(s.length()==0||s.length()==1){
			return 0;
		}
		int tmp=s.lastIndexOf(s.charAt(0));
		if(tmp==0){
			return s.length()/2+Times(s.substring(1,s.length()));
		}else{
			StringBuilder stringBuilder=new StringBuilder(s);
			stringBuilder.deleteCharAt(tmp);
			stringBuilder.deleteCharAt(0);
		
			return s.length()-tmp-1+Times(stringBuilder.toString());
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		String s=scanner.next();
		if(IsPalindrome(s)){
			System.out.println(Times(s));
		}else{
			System.out.println("Impossible");
		}
		scanner.close();
	}
}
