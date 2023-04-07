package buoi7;

public class testmain {
	public static void main(String[] args) {
		// 1. khởi tạo
		sinhVien sv = new sinhVien();
		sv.input();
		sv.output();
		
		sinhVien sv1 = new sinhVien("dh11c10", "simpLe",10);
		sv1.output();
		System.out.println("ho ten: "+sv1.getHoten());
		
		hinh h1= new hinh();
		System.out.println("diện tích hv: "+h1.dientich(10));
		System.out.println("diện tích hcn: "+h1.dientich(5,10));
		System.out.println("diện tích tam giac: "+h1.dientich(2,4,5));
	}
}
