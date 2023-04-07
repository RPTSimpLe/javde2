package buoi7;

import java.util.Scanner;

public class sinhVien {
	//1.khai báo
	private String masv, hoten;
	private float dtb;
	
	//2.get/set
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	//xanh thuộc tính
	//đỏ tham số
	
	//3. Contructor
	//3.1 ko có tham số truyền vào
	public sinhVien() {
	}
	
	//3.2 có tham số truyền vào
	public sinhVien(String masv, String hoten, float dtb) {
		this.masv = masv;
		this.hoten = hoten;
		this.dtb = dtb;
	}
	
	//5 nhập
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập mã sv: ");
		masv = sc.nextLine();
		System.out.println("nhập họ tên: ");
		hoten = sc.nextLine();
		System.out.println("nhập điểm tb: ");
		dtb = sc.nextFloat();
	}
	
	//6 trả về
	public void output() {
		System.out.println("mã sv: "+masv);
		System.out.println("họ tên: "+hoten);
		System.out.println("nhập điểm tb: "+dtb);
	}
	
//	public static void main(String[] args) {
//
//		sinhVien sv1 = new sinhVien();
//		sinhVien sv2 = new sinhVien();
//		
//		sv1.input();
//		sv1.output();
//		
//		sv2.input();
//		sv2.output();
//	}
}
