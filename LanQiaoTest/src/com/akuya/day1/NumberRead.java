package com.akuya.day1;

import java.util.Scanner;

public class NumberRead {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		char N[] = input.next().toCharArray();
		String ans[] = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu" };
		String dle[] = { "", "shi", "bai", "qian", "wan", "shi", "bai", "qian", "yi", "shi" };
		for (int i = 0; i < N.length; i++) {

			if (N[i] - 48 == 0) {

				if (i == N.length - 1 || N[i] == N[i + 1]) {
					;
				}

				else if (N.length - i - 1 == 4 || N.length - i - 1 == 9)
					System.out.print(dle[N.length - i - 1] + " ");

				else
					System.out.print(ans[N[i] - 48] + " ");
			}

			else if (N[i] - 48 == 1 && (N.length - i - 1 == 5 || N.length - i - 1 == 10)) {

				System.out.print(dle[N.length - i - 1] + " ");
			}

			else
				System.out.print(ans[N[i] - 48] + " " + dle[N.length - i - 1] + " ");

		}
	}

}
	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str[] = new String[] { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu" };
		if (n / 1000000000 != 0) {
			if (n / 1000000000 > 1) {
				System.out.print(str[n / 1000000000] + " " + "shi" + " ");
			} else {
				System.out.print("shi" + " ");
			}
		}
		if (n > 999999999 || n / 100000000 % 10 != 0) {
			if (n / 100000000 % 10 == 0) {
				System.out.println("yi" + " ");
			} else {

				System.out.print(str[n / 100000000 % 10] + " " + "yi" + " ");
			}
		}
		if (n > 99999999 || n / 10000000 % 10 != 0) {
			if (n / 10000000 % 10 != 0) {
				System.out.print(str[n / 10000000 % 10] + " " + "qian" + " ");
			}
		}
		if (n > 9999999 || n / 1000000 % 10 != 0) {
			if (n / 10000000 % 10 == 0) {
				System.out.print(str[n / 1000000 % 10] + " ");
			}
			System.out.print(str[n / 1000000 % 10] + " " + "bai" + " ");
		}
		if (n > 999999 || n / 100000 % 10 != 0) {
			if (n / 100000 % 10 != 0 && n / 100000 % 10 == 0) {
				System.out.print("ling" + " ");
			}
			if (n / 100000 % 10 != 0) {
				if(n/100000%10==1){
					System.out.print("shi"+" ");
				}else{
				System.out.print(str[n / 100000 % 10] + " " + "shi" + " ");
			}
				}
		}
		if (n > 99999 || n / 10000 % 10 != 0) {
			if (n / 10000 % 10 == 0) {
				System.out.print("wan" + " ");
			}
			System.out.print(str[n / 10000 % 10] + " " + "wan" + " ");
		}
		if (n > 9999 || n / 1000 % 10 != 0) {
			if (n / 1000 % 10 != 0) {
				System.out.print(str[n / 1000 % 10] + " " + "qian" + " ");
			}
		}
		if (n > 999 || n / 100 % 10 != 0) {
			if (n / 1000 % 10 != 0 && n / 100 % 10 == 0) {
				System.out.print("ling" + " ");
			}
			if (n / 100 % 10 != 0) {
				System.out.print(str[n / 100 % 10] + " " + "bai" + " ");
			}
			if((n / 1000 % 10 == 0 && n / 100 % 10 == 0)&&(n/10%10!=0||n%10!=0)){
				System.out.print("ling"+" ");
			}
		}
		if (n > 99 || n / 10 % 10 != 0) {
			if (n / 100 % 10 != 0 && n / 100 % 10 == 0) {
				System.out.print("ling" + " ");
			}
			if (n / 10 % 10 != 0) {
				if (n / 10 % 10 > 1) {
					System.out.print(str[n / 10 % 10] + " " + "shi" + " ");
				} else {
					System.out.print("shi" + " ");
				}
			}
		}
		if (n % 10 != 0) {
			System.out.print(str[n % 10]);
		}
	}*/

