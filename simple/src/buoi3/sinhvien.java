package buoi3;

public class sinhvien {
	private String masv,hoten;
	private float dlt,dth;
	
	public sinhvien() {
		masv = " ";
		hoten= " ";
		dlt= 0.f;
		dth= 0.f;
	}
	
	public sinhvien(String masv, String hoten, float dlt, float dth) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.dlt = (float) dlt;
		this.dth = dth;
	}
	
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
	public double getDlt() {
		return dlt;
	}
	public void setDlt(float dlt) {
		this.dlt = dlt;
	}
	public double getDth() {
		return dth;
	}
	public void setDth(float dth) {
		this.dth = dth;
	}
	
	public float dtb(float dtl, float dth) {
		return (dth+dlt)/2;
	}
	
	
	
}
