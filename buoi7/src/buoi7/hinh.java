package buoi7;

import java.util.Scanner;

public class hinh {
	private float a,b,c;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	
	public hinh() {
	}

	public hinh(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double dientich(float a) {
		return a*a;
	}
	
	public double dientich(float a,float b) {
		return a*b;
	}
	
	public double dientich(float a,float b,float c) {
		double p=(a+c+b)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
	}
}
