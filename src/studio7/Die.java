package studio7;

public class Die {

private static int sides;

	public Die(int n) {
		this.sides = n;
	}
	
	public int Size() {
		return (int) (Math.random() * this.sides)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die death = new Die(8);
		System.out.println(death.Size());
	
	}

}
