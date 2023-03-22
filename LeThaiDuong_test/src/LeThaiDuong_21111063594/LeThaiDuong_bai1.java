package LeThaiDuong_21111063594;

import java.util.Scanner;

public class LeThaiDuong_bai1 {
	public static void main(String[] args) {
//		câu 1: nhập int n, in ra s(n):
//			s(n)= 1^2 +2^2+...+n^2
		Scanner sc= new Scanner(System.in);
		int n=0;
		while(n<=0) {
			System.out.print("nhập số nguyên n>0: ");
			n= sc.nextInt();			
		}
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=Math.pow(i, 2);
		}
		System.out.println("S("+n+") = "+s);
	}
}
