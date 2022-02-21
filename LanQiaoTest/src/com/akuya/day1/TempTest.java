package com.akuya.day1;

import java.util.Arrays;
import java.util.Scanner;


public class TempTest {
	
	//第一种方法就是用Integer.parseInt(a,b); 
	//接收字符串a然后以b进制去接受它
	//再用Integer.toString(a, b)把a从十进制转换成b进制的数字
	
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 0; i <n; i++) {
//			String a = sc.next();
//			int b = Integer.parseInt(a,16);
//		//	System.out.println(b);
//			String ss =Integer.toString(b, 8);
//			System.out.println(ss);
//		}
//	}
	
	//第二种方法就是Integer类自带的二进制，八进制，十六进制
	//Integer.valueOf(a, b)这个的用法和上面那个parseInt一样
	
	
//	  public static void main(String[] args) {
//	        Scanner in=new Scanner(System.in);
//	        int n=in.nextInt();
//	        String [] result=new String[11];
//	        for(int i=0;i<n;i++){
//	                String h=in.next();
//	            String b=Integer.toBinaryString(Integer.valueOf(h, 16));
//	            String o=Integer.toOctalString(Integer.valueOf(b, 2));
//	            result[i]=o;
//	        }
//	        for(int i=0;i<n;i++){
//	                System.out.println(result[i]);
//	        }
//	    }
	
	//第三种就是比较传统的自己写出各种进制的表，这里就要用到二进制和八进制的关系了
	//这里大概说一下，如果想继续钻研的可以自己百度一下
	//因为是这里最高是16进制每一个二进制的里面都对着一个16进制的数字
	//因为正好2的4次方是16进制，2进制的四位数正好把每一个四进制的数都一一对应着
	//取得时候直接按照相等的值取就可以了
	//这道题就是先把16进制转换成二进制，再按照对应的方法取八进制对应的值
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input_n = scanner.nextLine();
		int n = Integer.parseInt(input_n);

		
		String[] input_nums = new String[n];
		for (int i = 0; i < n; i++) {
			input_nums[i] = scanner.nextLine();
		}
		scanner.close();
	
		String[] HEXs = { 
			"0", "1", "2", "3", "4", "5", "6", "7", 
			"8", "9", "A", "B", "C", "D", "E", "F"
		};
		
		String[] BINs = { 
			"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
			"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" 
		};
	
		String[] OCTs = { 
			"0", "1", "2", "3", "4", "5", "6", "7"
		};
		
		

		for (int m = 0; m < n; m++) { 
			String hex = input_nums[m]; 
			StringBuffer sbBin = new StringBuffer();
			StringBuffer sbOct = new StringBuffer();

			
			for (int i = 0; i < hex.length(); i++) {
				String c = Character.toString(hex.charAt(i));
				
				int index = Arrays.binarySearch(HEXs, c);
				sbBin.append(BINs[index]);
			}

			
			while (sbBin.length() % 3 != 0) {
				sbBin.insert(0, "0");
			}
			int octLen = sbBin.length() / 3;
		
			for (int i = 0; i < octLen; i++) {
				String span = sbBin.substring(3 * i, 3 * i + 3);
				int index = Arrays.binarySearch(BINs, "0" + span);
				sbOct.append(OCTs[index]);
			}

			
			while (sbOct.charAt(0) == '0') {
				sbOct.delete(0, 1);
			}

			System.out.println(sbOct.toString());
		}
	}

}

