package buoi3;

import java.util.Scanner;

public class ba3 {
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);	
	int n=3;
	float k=0,s=0;
	for(int i=1;i<=n;i++) {
		s+=i;
		k=(float) (k+1/s);
	}
	System.out.println(+k);
}
}
