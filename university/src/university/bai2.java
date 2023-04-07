package university;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a= ");
		int a= sc.nextInt();
		//chẵn lẻ
		if (a%2==0) {
			System.out.println("a là số chẵn");
		} else {
			System.out.println("a là số lẻ");
		}
		//âm dương
		if (a>0) {
			System.out.println("a là số dương");
		} else {
			System.out.println("a là số âm");
		}
	}
}

