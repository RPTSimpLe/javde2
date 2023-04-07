package buoi5;

import java.util.Scanner;

public class phuongtrinh {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap a,b,c: ");
		float a,b,c;
		a= sc.nextFloat();
		b= sc.nextFloat();
		c= sc.nextFloat();
		
	if(a==0) {
		if(b==0&&c==0) {
			System.out.println("pt vô số ng");
		}
		else if (b==0 && c!=0){
			System.out.println("pt vô ng");
		}
		else {
			System.out.println("pt bậc 1 có nghiệm "+(-c/b));
		}
	}
	else {
		double x1,x2,delta= b*b-4*a*c;
		if(delta==0) {
			System.out.println("pt có nghiệm kép"+(-b/2*a));
		}
		else if (delta>0){
			x1= (b-Math.sqrt(delta))/(2*a);
			x2= (-b-Math.sqrt(delta))/(2*a);
			System.out.println("pt có 2 nghiệm x1= "+x1+" và x2= "+x2);
		}
		else {
			System.out.println("pt vô ng");
		}
	}
	}
}
