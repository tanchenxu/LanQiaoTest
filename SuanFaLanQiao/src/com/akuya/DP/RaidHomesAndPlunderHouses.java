package com.akuya.DP;

import java.util.Scanner;

public class RaidHomesAndPlunderHouses {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("下面将创建被打劫的人家");
	System.out.println("请输入被打劫人家的数目");
	int n=scanner.nextInt();
	int home[]=new int[n];
	System.out.println("接下来请输入被打劫家的金额");
	for(int i=0;i<n;i++){
		home[i]=scanner.nextInt();
	}
	int max=0;
	System.out.print("最大金额为："+" ");
	System.out.println(rob( home, n));
}

	public static int rob( int[] home, int n) {
	
			if (n == 1) {
				return home[0];
			}
			else if (n == 2) {
				return Math.max(home[0], home[1]);
			}
			else if (n >= 3) {
				/*int memory[]=new int[n+1];
				memory[1]=home[0];
				memory[2]=Math.max(home[0], home[1]);
				for(int i=3;i<=n;i++){
				memory[i]=Math.max(memory[i-1],memory[i-2]+home[i-1]);
				}
				return memory[n];*/
				/**
				 * 进行状态压缩后的优化
				 */
				int cur=0;
				int pre2=home[0];
				int pre1=Math.max(home[0], home[1]);
				for(int i=3;i<=n;i++){
					cur=Math.max(pre1, pre2+home[i-1]);
					pre2=pre1;
					pre1=cur;
				}
				return cur;
			}else{
				return -1;
			}
	}
}
