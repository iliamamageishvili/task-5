package ge.ufc.sqr;

import ge.ufc.ilia.Rectangle;

public final class Square extends Rectangle{
	private float side;
	public Square(float side) {
		super(side,side);
		this.side = side;
	}
	
	public float getSide() {
		return side;
	}
	
	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public float perimeter() {
		return super.perimeter();
	}

	@Override
	public float area() {
		return super.area();
	}
	
}
