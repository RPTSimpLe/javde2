package buoi4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class baitp {
public static void main(String[] args) {
	float a,b;
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner scanner= new Scanner(System.in);
	System.out.println("nhap a,b: ");
	a = scanner.nextFloat();
	b = scanner.nextFloat();
	
	//giá trị tuyệt đối
	System.out.println("trị tuyệt đối "+a+": "+df.format(Math.abs(a)));
	System.out.println("trị tuyệt đối "+b+": "+df.format(Math.abs(b)));
	// max, min
	System.out.println("max("+a+", "+b+")"+df.format(Math.max(a, b)));
	System.out.println("min("+a+", "+b+")"+df.format(Math.min(a,b)));
	// mũ ba
	System.out.println("căn bậc ba của "+a+"là "+df.format(Math.pow(a, 3)));
	System.out.println("căn bậc ba của "+b+"là "+df.format(Math.pow(b, 3)));
}
}
