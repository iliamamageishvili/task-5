package ge.ufc.ilia;

import ge.ufc.sqr.Square;

public class Main {

	public static void main(String[] args) {
		Figure fg = new Figure("Figure");
		Rectangle rc = new Rectangle(3,5);
		Square sq = new Square(4);
		System.out.println(fg.area());
		System.out.println(rc.area());
		System.out.println(sq.area());
		System.out.println(fg.perimeter());
		System.out.println(rc.perimeter());
		System.out.println(sq.perimeter());
		System.out.println(rc instanceof Figure);
		System.out.println(sq instanceof Figure);
		System.out.println(sq instanceof Rectangle);
	}

}
