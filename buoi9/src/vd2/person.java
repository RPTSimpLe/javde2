package vd2;

import java.util.Scanner;

public class person {
	private String hoten, diachi;
	private int tuoi;
	
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public person(String hoten, String diachi, int tuoi) {
		super();
		this.hoten = hoten;
		this.diachi = diachi;
		this.tuoi = tuoi;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập họ tên: ");
		hoten = sc.nextLine();
		System.out.println("nhập tuổi: ");
		tuoi = sc.nextInt();
		System.out.println("nhập địa chỉ: ");
		diachi = sc.nextLine();

	}
	
	public void output() {
		System.out.println("họ tên: "+hoten);
		System.out.println("tuổi: "+tuoi);
		System.out.println("địa chỉ: "+diachi);
	}
}
