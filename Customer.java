
public class Customer {
	private String na;
	private String fo;
	private int ti;
	public Customer(String name, String food) {
		na = name;
		fo = food;
		if (food.toLowerCase().equals("hamburger")) {
			ti = 6;
		}
		if (food.toLowerCase().equals("pizza")) {
			ti = 4;
		}
		if (food.toLowerCase().equals("salad")) {
			ti = 5;
		}
	}
	public String getName() {
		return na;
	}
	public String getFood() {
		return fo;
	}
	public int getTime() {
		return ti;
	}
	public void cycle() {
		ti--;
	}
	public boolean isReady() {
		if (ti == 0) {
			return true;
		}
		return false;
	}
}
