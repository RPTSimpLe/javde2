package buoi4;

public class vidu {
	public static void main(String[] args) {
		Boolean soSanh;
		int a,b;
		a=5;
		b=10;
		soSanh=(a==b);
		System.out.println("kết quả so sánh "+a+"="+b+" khong? "+soSanh);
		soSanh=(a<b);
		System.out.println("kết quả so sánh "+a+"<"+b+" khong? "+soSanh);
		soSanh=(a!=b);
		System.out.println("kết quả so sánh "+a+"#"+b+" khong? "+soSanh);
		soSanh=(a>=b);
		System.out.println("kết quả so sánh "+a+">="+b+" khong? "+soSanh);
		soSanh=(a<b)||(a==b); 
		System.out.println("kết quả so sánh "+a+"<="+b+" khong? "+soSanh);
		soSanh=!true;
		System.out.println("biến soSanh được gán bằng giá trị phủ định của true, là: "+soSanh);
	}
}
