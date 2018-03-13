import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RestarauntDriver {
	public static void main(String args[]) {
		boolean notQuit = true;
		System.out.println("Welcome to the Phone Book");
		Scanner s = new Scanner(System.in);
		Queue<Customer> line = new LinkedList<Customer>();
		while(notQuit) {
			System.out.println("Enter C to add a person, or Q to quit.");
			String in = s.nextLine();
			
			if (in.toLowerCase().contains("c")) {
				String name;
				String order;
				System.out.println("What is the customer's name?");
				name = s.nextLine();
				System.out.println("What is the customer ordering? Hamburger, Pizza or Salad?");
				order = s.nextLine();
				Customer cust = new Customer(name, order);
				line.add(cust);
			} else if (in.toLowerCase().contains("q")) {
				notQuit = false;
			}
			try {
			if (line.peek().isReady()) {
				System.out.println(line.peek().getName()+"'s " + line.peek().getFood() + " is ready!");
				line.remove();
			}
			System.out.println(line.peek().getName()+"'s " + line.peek().getFood() + " is cooking with " + line.peek().getTime() + " minutes remaining.");
			line.peek().cycle();
			} catch(NullPointerException e) {
				System.out.println("The diner has no orders.");
			}
		}
	}
}
