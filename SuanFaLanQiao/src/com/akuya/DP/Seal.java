package com.akuya.DP;

import java.util.Scanner;

public class Seal {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		double result=phase(n, m);
		System.out.printf("%.4f",result);
			
	}
	
	public static double phase(int m,int n) {
		if(m>=n&&n==1){
			return 1;
		}
		else if(m<n){
			return 0;
		}else{
			double p=1.0/n;
			double Seal[][]=new double [m+1][n+1];
			for(int i=1;i<=m;i++){
				for(int j=1;j<=n;j++){
					if(i<j){
						Seal[i][j]=0;
					
					}else if(j==1){
						  Seal[i][j]=Math.pow(p, i-1);
					}else{
						Seal[i][j]=Seal[i-1][j-1]*(p*(n-(j-1)))+Seal[i-1][j]*(p*j);
					}
				}
			}
			
			return Seal[m][n];
		}
	}
	/*
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        double p=1.0/n;

        double[][] b=new double[m+1][n+1];
        if (n==1){  //当n=1时m>n几率为1
            b[m][n]=1;
            System.out.printf("%.4f",b[m][n]);
            return;
        }
        if (n>1&&m<n){ //当m<n时几率为0
            b[m][n]=0;
            System.out.printf("%.4f",b[m][n]);
            return;
        }
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if (i<j) b[i][j]=0;       //当m<n时几率为0
                if (j==1){
                    b[i][j]=Math.pow(p,i-1);        //当i张集齐1种的概率
                }else  {
                    b[i][j]=b[i-1][j]*(j*1.0/n)+b[i-1][j-1]*((n-j+1)*1.0/n);        //当i张集齐j种的概率
                }

            }

        }

        System.out.printf("%.4f",b[m][n]);

    }*/
}

