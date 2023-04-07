package buoi9;

import java.util.Scanner;

public class sinhvien {
	private String hoten,lop,email;
	private int masv;
	private float dth, dlt;
	
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public float getDth() {
		return dth;
	}
	public void setDth(float dth) {
		this.dth = dth;
	}
	public float getDlt() {
		return dlt;
	}
	public void setDlt(float dlt) {
		this.dlt = dlt;
	}
	
	public sinhvien() {
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
		this.masv = masv;
		this.dth = dth;
		this.dlt = dlt;
	}
	
	public double dtb() {
		return (dlt+dth)/2;
	}
	@Override
	public String toString() {
		return "sinhvien: hoten=" + hoten + ", lop=" + lop + ", email=" + email + ", masv=" + masv + ", dth=" + dth
				+ ", dlt=" + dlt;
	}
	
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập mã sv: ");
		masv = Integer.parseInt(sc.nextLine());
		System.out.println("nhập họ tên: ");
		hoten = sc.nextLine();
		System.out.println("nhập lớp: ");
		lop = sc.nextLine();
		System.out.println("nhập email: ");
		email = sc.nextLine();
		System.out.println("nhập điểm lt: ");
		dlt = sc.nextFloat();
		System.out.println("nhập điểm th: ");
		dth = sc.nextFloat();
	}
	
	public void output() {
		System.out.println("-------------------thông tin sv--------------------");
		System.out.println("mã sv: "+masv);
		System.out.println("họ tên: "+hoten);
		System.out.println("lớp: "+lop);
		System.out.println("email: "+email);
		System.out.println("điểm lt: "+dlt);
		System.out.println("điểm th: "+dth);
		System.out.println("điểm trung bình: "+dtb());

	}
}


