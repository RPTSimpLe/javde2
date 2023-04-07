package university;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {

		//hình vuông
		System.out.println("Hình vuông");
		Scanner sc = new Scanner(System.in);
		DecimalFormat haiSo= new DecimalFormat("#.#");
		System.out.println("độ dài cạnh = ");
		int a = sc.nextInt();
		int pHinhVuong = a*4;
		System.out.println("chu vi hình: "+pHinhVuong);
		int sHinhVuong = a*a;
		System.out.println("diện tích: "+sHinhVuong);

		// tam giác
		System.out.println("\nHình tam giác");		
		System.out.println("độ dài 3 cạnh: ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a+b<=c||b+c<=a||c+a<=b) {
			System.out.println("không tạo thành tam giác");
		}
		else {
		int p = b+c+d;
		System.out.println("chu vi: "+p);
		double nCV= (double)(b+c+d)/2;
		double sTamGiac= Math.sqrt(nCV*(nCV-a)*(nCV-b)*(nCV-c));
		System.out.println("diện tích: "+haiSo.format(sTamGiac));
		}
		//hình chữ nhật
		System.out.println("\nHình chữ nhật");
		System.out.println("chiều rộng");
		int e= sc.nextInt();
		System.out.println("chiều dài");
		int f= sc.nextInt();
		
		float pHCN= (float)(e+f)/2;
		System.out.println("chu vi: "+haiSo.format(pHCN));
		int sHCN= e*f;
		System.out.println("diện tích: "+sHCN);
		
		//hình tròn
		System.out.println("\nHình tròn");
		System.out.println("bán kính: ");
		int r= sc.nextInt();
		
		double pHT= (double)Math.PI*r*2;
		System.out.println("chu vi: "+haiSo.format(pHT));
		double sHT= (double)Math.PI*r*r;
		System.out.println("diện tích: "+haiSo.format(sHT));
		
	}
}
