package com.akuya.day1;

/*import java.util.Scanner;

public class FIbonacci {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int temp=Fibonaci(n);
	System.out.println(temp);
}

public static int Fibonaci(int n ) {
	if(n<=0){
		return -1;
	}
		
		if(n==1||n==2){
		return 1;
	}else{
			return (Fibonaci(n-1)+Fibonaci(n-2))%10007;
	}
	
}
}
*/

import java.util.Scanner;
public class FIbonacci {
	
	public static void main(String[] args) {
        int[] a = new int[10000001];
        a[1] = 1;
        a[2] = 1;
        int n = new Scanner(System.in).nextInt();
        for (int i=3; i<=n; i++){
            a[i] = (a[i-1]+a[i-2])%10007;
        }
        System.out.println(a[n]);
    }
}
