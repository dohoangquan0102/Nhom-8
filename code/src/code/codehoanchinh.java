package code;

public class codehoanchinh {
	public class Main {
	    public static void swap(int a, int b) {
	        int c = a;
	        a = b;
	        b = c;
	        System.out.println("Ket qua swap: " + "a = " + a + " b= " + b);
	    }
	    public static void main(String[] args) {
	        int a = 5, b = 3;
	        swap(a, b);
	        System.out.println("a sau khi swap: " + a);
	        System.out.println("b sau khi swap: " + b);
	    }
	}
}
