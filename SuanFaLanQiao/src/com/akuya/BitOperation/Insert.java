package com.akuya.BitOperation;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler;

public class Insert {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入插入的区间");
		int i = scanner.nextInt();
		int j = scanner.nextInt();

		int n = scanner.nextInt();

		int m = scanner.nextInt();

		for (int k = i; k <= j; k++) {
			n &= (~((long) 1 << k));
		}
		System.out.println(n|(m<<i));
	}
}
