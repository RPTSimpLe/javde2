package lthdt;

public class hoaDonCaPhe {
	private String tenloaicf;
	private double giaTien1kg,khoiLuong;
	
	public hoaDonCaPhe(String ten, double gia, double kl) {
		this.tenloaicf = ten;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;
	}
	
	public double tongTien() {
		return this.giaTien1kg*khoiLuong;
	}
	public boolean ktra(double kl) {
		return this.khoiLuong>kl;	
	}
	public boolean ktragia() {
		if(this.tongTien() > 500000)
		return true;
		else return false;
	}
	public double coupon() {
		if(this.ktragia()) {
		return (tongTien()*10/100);
		}
		else
			return 0;
	}
	public double khachtra() {
		return this.tongTien() - this.coupon();
	}
}
