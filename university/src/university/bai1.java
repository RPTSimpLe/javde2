package university;

import java.text.ParseException;
import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập họ tên: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhập mã sv: ");
		long maSV = Long.parseLong(sc.nextLine());
		
		System.out.println("Nhập tuổi: ");
		int tuoi = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhập lớp: ");
		String  lop = sc.nextLine();

		System.out.println("Nhập trường: ");
		String truong = sc.nextLine();
	
		System.out.println("Nhập địa chỉ: ");
		String diaChi = sc.nextLine();
		
		System.out.println("Nhập email: ");
		String email = sc.nextLine();
		
		System.out.println("Nhập số điện thoại: ");
		String soDienThoai = sc.nextLine();
		
		System.out.println("Nhập khoa: ");
		String khoa = sc.nextLine();
		
		System.out.println("Nhập điểm trung bình: ");
		float dTB = sc.nextFloat();
		
		System.out.println("Họ Tên: " +hoVaTen);
		System.out.println("mã sinh viên: " +maSV);
		System.out.println("Tuổi: " +tuoi);
		System.out.println("Lớp: " +lop);
		System.out.println("khoa: " +khoa);
		System.out.println("Trường: " +truong);
		System.out.println("Địa chỉ: " +diaChi);
		System.out.println("Điểm trung bình: " +dTB);
		System.out.println("Email: " +email);
		System.out.println("Số điện thoại: " +soDienThoai);
	}
}
