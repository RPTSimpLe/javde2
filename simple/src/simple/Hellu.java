package simple;

import java.util.Scanner;

public class Hellu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		//menu
		System.out.println("1. Xét học lực ");
		System.out.println("2. GIẢI PHƯƠNG TRÌNH");
		System.out.println("3. TÍNH TIỀN ĐIỆN");
		
		System.out.println("Mời bạn chọn bài tập số: ");
		n= sc.nextInt();
				
		switch (n) {
		case 1: {
			float diem;
			System.out.println("nhập điểm của sinh viên: ");
			diem= sc.nextFloat();
			
			if(diem>=9) {
				System.out.println("học lực xuất sắc");
			}
			if(diem>=8) {
				System.out.println("học lực giỏi");
			}
			else if (6.5<=diem) {
				System.out.println("học lực khá");
			}
			else if (5<=diem) {
				System.out.println("học lực trung bình");
			}
			else if (diem>=3.5) {
				System.out.println("học lực yếu");
			}
			if(diem<3.5) {
				System.out.println("học lực kém");
			}
			break;
			}
		case 2: {
			float a,b,c;
			System.out.println("nhap a: ");
			a= sc.nextFloat();
			System.out.println("nhap b: ");
			b= sc.nextFloat();
			System.out.println("nhap c: ");
			c= sc.nextFloat();
		
			System.out.println("phương trình bậc 1: ");	
			if(a==0) {
				if(b==0) {
					System.out.println("phương trình vô số nghiệm");
				}
				else {
					System.out.println("phương trình vô nghiệm");
				}
			}
			else {
				System.out.println("phương trình có nghiệm x= " +(-b/a));
			}
			
			
			System.out.println("phương trình bậc 2: ");			
			if(a==0) {
				if(b==0&&c==0) {
					System.out.println("phương trình vô số nghiệm");
					}
				else if (b==0 && c!=0){
					System.out.println("phương trình vô nghiệm");
					}
				else {
					System.out.println("phương trình có nghiệm "+(-c/b));
					}
				}
			else {
				double x1,x2,delta= b*b-4*a*c;
				if(delta==0) {
					System.out.println("phương trình có nghiệm kép"+(-b/2*a));
					}
				else if (delta>0){
					x1= (b-Math.sqrt(delta))/(2*a);
					x2= (-b-Math.sqrt(delta))/(2*a);
					System.out.println("phương trình có 2 nghiệm x1= "+x1+" và x2= "+x2);
					}
				else {
					System.out.println("phương trình vô nghiệm");
					}
				}
			break;
		}
		case 3: {
			int soDien,giaDien;
			System.out.println("nhập số điện tiêu thụ hàng tháng: ");
			soDien= sc.nextInt();
			
			if(soDien>=401) {
				giaDien= 2927;
				System.out.println("Số tiền cần đóng: "+(giaDien*soDien));
			}
			else if(soDien>=301) {
				giaDien= 2834;
				System.out.println("Số tiền cần đóng: "+(giaDien*soDien));
			}
			else if(soDien>=201) {
				giaDien= 2536;
				System.out.println("Số tiền cần đóng: "+(giaDien*soDien));
			}
			else if(soDien>=101) {
				giaDien= 2014;
				System.out.println("Số tiền cần đóng: "+(giaDien*soDien));
			}
			else if(soDien>=51) {
				giaDien= 1734;
				System.out.println("Số tiền cần đóng: "+(giaDien*soDien));
			}
			else if(soDien<=50) {
				giaDien= 1678;
				System.out.println("Số tiền cần đóng: "+(giaDien*soDien));
			}
			break;
			}
		default:
			System.out.println("sai giá trị, mời nhập lại [1-3]");
			break;
		}
	}
}
