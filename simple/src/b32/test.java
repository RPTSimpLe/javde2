package b32;

public class test {
	public static void main(String[] args) {
		myDate d1 = new myDate(3, 5, 2003);
		myDate d2 = new myDate(4, 9, 2000);
		myDate d3 = new myDate(3, 5, 2003);
		System.out.println(d1);
		System.out.println("d1 vs d3: "+d1.equals(d3));
		System.out.println("d1 vs d3: "+d1.equals(d2));
	}
}
