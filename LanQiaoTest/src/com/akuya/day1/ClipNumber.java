package com.akuya.day1;

import java.util.Scanner;

public class ClipNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int m=scanner.nextInt();
	int n=scanner.nextInt();
	int arr[][]=new int[m][n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			arr[i][j]=scanner.nextInt();
		}
	}
	result(0,0,1,arr,m,n);
	scanner.close();
}

	public static void result(int i, int j, int direction, int num[][], int m, int n) {
		if(m==1&&n==1){
			System.out.println(num[0][0]);
			return;
		}
		if(direction==1){
			if(i+1==m||num[i+1][j]==-1){
				if(j+1==n||num[i][j+1]==-1){
					return;
				}else{
					result(i, j, 2, num, m, n);
				}
			}else{
				int begin=i;
				while(i<m){
					if(num[i][j]!=-1){
					System.out.print(num[i][j]+" ");
					num[i][j]=-1;
					}else{
						if(begin!=i){
							break;
						}
					}
					i++;
				}
				result(i-1, j, 2, num, m, n);
			}
		}
		
		if(direction==2){
			if(j+1==n||num[i][j+1]==-1){
				if(i-1<0||num[i-1][j]==-1){
					return;
				}else{
					result(i, j, 3, num, m, n);
				}
			}else{
				int begin=j;
				while(j<n){
					if(num[i][j]!=-1){
						System.out.print(num[i][j]+" ");
						num[i][j]=-1;
					}else{
						if(begin!=j){
							break;
						}
					}
					j++;
				}
				result(i, j-1, 3, num, m,n);	
			}
		}
	
		if(direction==3){
            if(i-1<0||num[i-1][j]==-1){
                if(j-1<0||num[i][j-1]==-1)
                    return;
                else
                    result(i, j, 4, num, m, n);
            }else{
                int begin=i;
                while(i>=0){
                    if(num[i][j]!=-1){
                        System.out.print(num[i][j]+" ");
                        num[i][j]=-1;
                    }else{
                        if(begin!=i)
                            break;
                    }
                    i--;
                }
                result(i+1, j, 4, num, m, n);
            }


        } 
        if(direction==4){
            if(j-1<0||num[i][j-1]==-1){
                if(i+1==m||num[i+1][j]==-1)
                    return ;
                else
                    result(i, j, 1, num, m, n);
            }else{
                int begin=j;
                while(j>=0){
                    if(num[i][j]!=-1){
                        System.out.print(num[i][j]+" ");
                        num[i][j]=-1;                   
                    }else{
                        if(begin!=j)
                            break;
                    }
                    j--;    
                }
                result(i, j+1, 1, num, m, n);
            }       
        }

		
		
	}

}
