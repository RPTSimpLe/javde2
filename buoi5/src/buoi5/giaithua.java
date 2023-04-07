package buoi5;

import java.util.Scanner;

public class giaithua {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=5,i;
		int s=1;
		for(i=1;i<=n;i++) {
			s*=i;
		}
		System.out.println("giai thua cua 5 là "+s);
		
		int x=0;
		while(x<=10) {
			System.out.println("nhập x>10: ");
			x= sc.nextInt();
		}
		}
	}

