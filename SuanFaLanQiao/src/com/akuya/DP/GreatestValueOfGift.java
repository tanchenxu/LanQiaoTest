package com.akuya.DP;

import java.util.Scanner;

public class GreatestValueOfGift {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("请输入数组行数");
	int i=scanner.nextInt();
	System.out.println("请输入数组列数");
	int j=scanner.nextInt();
	int gift[][]=new int[i][j];
	System.out.println("请输入数组内容");
	for(int k=0;k<i;k++){
		for(int l=0;l<j;l++){
			gift[k][l]=scanner.nextInt();
		}
	}
	System.out.println(Value(gift, i, j));
}

	public static int Value(int gift[][], int i, int j) {
		int mery[][] = new int[i + 1][j + 1];
		if (i == 1 && j == 1) {
			return gift[0][0];
		} else {
			for (int k = 1; k <= i; k++) {
				for (int l = 1; l <= j; l++) {
					if (k == 1 && l == 1) {
						mery[k][l] = gift[0][0];
					} else if (k == 1 && l > 1) {
						mery[k][l] = mery[k][l - 1] + gift[k - 1][l - 1];
					} else if (k > 1 && l == 1) {
						mery[k][l] = mery[k - 1][l] + gift[k - 1][l - 1];
					} else {
						mery[k][l] = Math.max(mery[k - 1][l] + gift[k - 1][l - 1], mery[k][l - 1] + gift[k - 1][l - 1]);
					}
				}
			}
			return mery[i][j];
		}
	}
}
