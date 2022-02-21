package com.akuya.day1;

import java.util.Scanner;

public class TortoiseAndrRabbit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v1 = scanner.nextInt();
		int v2 = scanner.nextInt();
		int t = scanner.nextInt();
		int s = scanner.nextInt();
		int l = scanner.nextInt();
		int st = 0, sr = 0;
		int time = 0;
		while (true) {
			if (sr - st >= t) {
				int i = 0;
				while (i < s) {
					st += v2;
					time++;
					if (st >= l) {
						System.out.println("T");
						System.out.println(time);
						return;
					}
					i++;
				}
			}
			sr += v1;
			st += v2;
			time++;
			if ((sr == st) && st == l) {
				System.out.println("D");
				System.out.println(time);
				return;
			}
			if (sr == l) {
				System.out.println("R");
				System.out.println(time);
				return;
			}
			if (st == l) {
				System.out.println("T");
				System.out.println(time);
				return;
			}
		}
	}
}
