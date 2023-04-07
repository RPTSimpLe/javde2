package buoi5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class hócluc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.##");
		float m1,m2,m3;
		System.out.println("nhập điểm môn 1: ");
		m1= sc.nextFloat();
		System.out.println("nhập điểm môn 2: ");
		m2= sc.nextFloat();
		System.out.println("nhập điểm môn 3: ");
		m3= sc.nextFloat();
		
		float dTB= (m1+m2+m3)/3;
		System.out.println("điểm trung bình: "+df.format(dTB));
		if(dTB>=8) {
			System.out.println("giỏi");
		}
		else if (6.5<=dTB) {
			System.out.println("khá");
		}
		else if (5<=dTB) {
			System.out.println("trung bình");
		}
		else if (dTB<=5) {
			System.out.println("yếu");
		}
	}
}
