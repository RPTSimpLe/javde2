package university;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a,b= ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int tong = a + b;
		int hieu = a - b;
		int phanDu = a % b;
		float thuong = (float) a / b;

		System.out.println("tổng: " + tong);
		System.out.println("hiệu: " + hieu);
		System.out.println("thương: " + thuong);
		System.out.println("phần dư: " + phanDu);

	}
}
