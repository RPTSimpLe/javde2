package buoi5;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		//menu
		System.out.println("1. Nhập thông tin sinh viên ");
		System.out.println("2. Hiển thị thông tin sinh viên");
		System.out.println("3. Thêm thông tin sinh viên");
		System.out.println("4. Sửa thông tin sinh viên");
		System.out.println("5. Xóa  thông tin sinh viên");
		System.out.println("6. Tìm kiếm sinh viên theo mã ");
		System.out.println("7. Thoát khỏi chương trình");
		int tuoi=0;
		String hoVaTen="",lop="",truong="",diaChi="",email="",soDienThoai="",khoa="";
		long maSV=0;
		float dTB=0;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("mời bạn chọn menu: ");
		a= sc.nextInt();
	
		switch (a) {
		case 1: {
			
			System.out.println("Nhập họ tên: ");
			hoVaTen = sc.nextLine();
			sc.nextInt();
			
			System.out.println("Nhập lớp: ");
			lop = sc.nextLine();

			System.out.println("Nhập trường: ");
			truong = sc.nextLine();
		
			System.out.println("Nhập địa chỉ: ");
			 diaChi = sc.nextLine();
			
			System.out.println("Nhập email: ");
			email= sc.nextLine();
			
			System.out.println("Nhập số điện thoại: ");
			 soDienThoai = sc.nextLine();
			
			System.out.println("Nhập khoa: ");
			khoa = sc.nextLine();
			
			System.out.println("Nhập mã sv: ");
			maSV = sc.nextLong();
			
			System.out.println("Nhập tuổi: ");
				tuoi = sc.nextInt();
			
			System.out.println("Nhập điểm trung bình: ");
			 dTB = sc.nextFloat();
			break;
			}
		case 2: {
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
			break;
			}
		case 3: {
			System.out.println("thêm");	
			break;
			}
		case 4: {
			System.out.println("thứ 4");
			break;
			}
		case 5: {
			System.out.println("thứ 5");
			break;
			}
		case 6: {
			System.out.println("thứ 6");
			break;
			}
		case 7: {
			System.out.println("tạm biệt");
			break;
			}
		default:
			System.out.println("sai giá trị, mời nhập lại [1-7]");
			break;	
		}
}
}