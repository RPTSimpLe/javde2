package baitap;

public class bai1 {
public static void main(String[] args) {
	System.out.println("cac snt la : ");
	for(int i=100; i<=300;i++) {
		int dem=0;
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				dem++;
			}
		}
		if(dem==0) {
			System.out.println(i);
		}
	}
}
}
