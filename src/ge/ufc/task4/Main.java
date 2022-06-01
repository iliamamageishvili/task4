package ge.ufc.task4;

public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(50,50);
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		Rectangle r2 = new Rectangle(10,10);
		Rectangle r3 = new Rectangle(12,10);
		Rectangle r4 = new Rectangle(13,10);
	Rectangle[] tst = { r1,r2,r3,r4					
	};
	System.out.println(Rectangle.maxArea(tst));
	System.out.println(Rectangle.maxArea(tst).area());
	}
}
