package baitap;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		int n, s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cac phan tu cua mang");
		n = sc.nextInt();

		// nhap
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
			System.out.println();
		}
//	for(int i =0;i<a.length;i++) {
//		s+=a[i];
//		System.out.println("kq="+s);
//	}

		// xuat
		System.out.println("cac phan tu mang la : ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		System.out.println("tong cac phan tu cua mang la :" + s);
//sxep cac ptu
//	int i,j;
		int min, temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("mang sau khi xs la : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		System.out.println();
///max,min
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Gia tri lon nhat cua mang la : " + max);
	}
}
