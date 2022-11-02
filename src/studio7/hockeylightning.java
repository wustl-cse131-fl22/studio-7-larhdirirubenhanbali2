package studio7;

public class hockeylightning {

	private static String name;
	private static int number;
	private static String hand;
	private static int goals;
	private static int assists;
	private static int games;

	//int points = goals+assists;

	
	public hockeylightning(int a, int g, int o) {
		this.assists = a;
		this.games = g;
		this.goals= o;
	}
	public int totalPoints() {
		return games;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
