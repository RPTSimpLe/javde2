package lthdt;

public class test {
	public static void main(String[] args) {
		hoaDonCaPhe hd = new hoaDonCaPhe("Trung Nguyen", 200000, 3);
		System.out.println(+hd.tongTien());
		System.out.println("kl: "+hd.ktra(2));
		System.out.println("tong: "+hd.ktragia());
		System.out.println("coupon: "+hd.coupon());
		System.out.println("khach tra: "+hd.khachtra());
		
		hoaDonCaPhe hd2 = new hoaDonCaPhe("concac",100000,1);
		System.out.println(+hd2.tongTien());
		System.out.println("kl: "+hd2.ktra(2));
		System.out.println("tong: "+hd2.ktragia());
		System.out.println("coupon: "+hd2.coupon());
		System.out.println("khach tra: "+hd2.khachtra());
	}
}
