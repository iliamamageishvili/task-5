package ge.ufc.ilia;

public class Rectangle extends Figure{
	private float height;
	private float width;
	
	public Rectangle(float height, float width) {
		super("Create Figure");
		this.height = height;
		this.width = width;
	}
	
	public Rectangle() {
		this(3,4);
	}
	
	public void setHeight(float height) {
		this.height = height;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	public float perimeter() {
		return 2*(height + width);
	}

	public float area() {
		return height * width;
	}

	protected static float perimeter(float height, float width) {
		return 2*(height + width);
	}

	protected static float area(float height, float width) {
		return height * width;
	}
	
	
}
