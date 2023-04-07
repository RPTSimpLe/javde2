package buoi5;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập a: ");
		a= sc.nextInt();
		
		if (a%5==0) {
			System.out.println(+a+" chia het cho 5");
		} else {
			System.out.println(+a+" ko chia het");
		}
	}
}
