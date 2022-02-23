package com.akuya.suanfa;
import java.util.Scanner;
/**
 * 
 * @Description 这一个实在看不懂，希望以后能理解
 * @author akuya Email:1828504053@qq.com
 * @version
 * @date 2022年2月22日下午6:06:41
 *
 */
public class LanQiaoFindNumber {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();//输入值，查找
        long[] arr =new long[44725];
        arr[0]=1;
        long k=1L;//k来定义位置
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 1;i<44725; i++) {
            for (int j = i; j>=1; j--) {
                arr[j] += arr[j - 1];//换行后，用自己进行运算，减少内存
                if (arr[j] == n) {
                    System.out.println(k + i-j + 1);
                    return;//如果找到了就结束
                }
            }
            k+=(i+1);
        }
        System.out.println(((1 + n) * n / 2) + 2);
    }
}

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//输入一个数 返回它在杨辉三角里第一次出现的位置
//未解决
public class LanQiaoFindNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a=scan.nextInt();
        LanQiaoFindNumber.yanghuisanjiao(a);
    }

    public static void yanghuisanjiao(long k){
        if (k==1) {System.out.println(1);
        return ;
        }
        long[] []arr;
        arr=new long[100][];//动态创建二维数组
        List list=new ArrayList();
        for (int i = 0; i < 100; i++) {
            arr[i]=new long[i+1];//给第i行的数组赋长度
            arr[i][0]=1;//给所有第一列的数赋值
            list.add(1);//把所有的1存入列表
            for (int j =1 ; j <=i; j++) {
                if(j==i){//如果在每行数组的最右边就赋值为1
                    arr[i][j]=1;
                    list.add(1);
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];//杨辉三角特性：下面的数字等于上面两个数字之和
                    list.add( arr[i][j]);//存入列表

                }
            }

        }
        if((list.indexOf(k)+1)==0){//如果在第100行以内没有找到的话就在第二斜列寻找 符合等差数列
            System.out.println(k+2+(k*(k-1))/2);
        }else
            System.out.println(list.indexOf(k)+1);
    }

}*/
/*
public class LanQiaoFindNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		long arr[][] = new long[10000][10000];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}
		int pos = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (arr[i][j] == n) {
					System.out.println(pos);
				} else {
					pos++;
				}
			}
		}
	}
}*/
