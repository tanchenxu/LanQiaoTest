package com.akuya.day1;

import java.util.Scanner;

public class ChipTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[][] = new int[n][n];
		int temp[] = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
				if (arr[i][j] == 1) {
					temp[j]++;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(temp[i]>(n/2)){
				System.out.print((i+1)+" ");
			}
		}
	}
}
