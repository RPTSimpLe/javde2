package LeThaiDuong_21111063594;

import java.util.Scanner;

public class LeThaiDuong_bai2 {
	public static void main(String[] args) {
//		câu 2: nhập mảng 1 chiều số thực n, hiển thị ra màn hình
////		- tổng các ptu trong mảng
////		- sắp xếp từ bé đến lớn;
////		- giá trị nhỉ nhất;
////		- tìm trong mảng có ptu 2.0 không? in ra
		Scanner sc= new Scanner(System.in);
		//nhập
			System.out.print("nhập số nguyên n>0: ");
			int n= sc.nextInt();			
			float[] a= new float[n] ; 
			for(int i=0; i<a.length;i++) {
				System.out.print("a["+i+"] = ");
				a[i]= sc.nextInt();
				System.out.println();
		}
		//tổng các ptu
		int tong=0;
		for(int i=0; i<a.length;i++) {
			tong+=a[i];
		}
		System.out.println("tổng các phần tử trong mảng là: "+tong);
		//sắp xếp
		float tmp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		System.out.println("mảng sau khi sắp xếp từ bé đến lớn là: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		//min
		float min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min= a[i];
			}
		}
		System.out.println("min= "+min);
		//ktra
		boolean z=false;
		for(int i=0; i<n; i++) {
		if(a[i]==2) {
				System.out.println("a["+i+"]= 2");
				z=true;
			}
		}
		if(z==false) {
			System.out.println("không có phần tử 2.0");
		}
	}	
}
