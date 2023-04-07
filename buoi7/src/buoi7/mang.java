package buoi7;

import java.util.Scanner;

public class mang {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so phan tu trong mang");
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("a["+i+"]");
			a[i]= sc.nextInt();
//			a[i]= Interger.parseInt(sc.nextLine());
			System.out.print(a[i]+"\t");
		}
		System.out.println();
//		3.tinh tong
		int tong=0;
		for(int i=0;i<n;i++) {
			tong+=a[i];
		}
		System.out.println("tong cac phan tu la: "+tong);
	}
}
