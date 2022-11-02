package studio7;

public class Rectangle {

private static int length;
private static int width; 

	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int findArea() {
		return this.length * this.width;
	}
	
	public int findPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	public boolean isSquare() {
		if(this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle wRect = new Rectangle(4, 20);
		System.out.println(wRect.getLength());
		System.out.println(wRect.getWidth());
		System.out.println(wRect.findArea());
		System.out.println(wRect.findPerimeter());
		System.out.println(wRect.isSquare());

	}

}
