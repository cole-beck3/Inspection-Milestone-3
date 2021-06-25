//Cole Beck
public class Switching {

	public static void main(String[] args) {
		int age;
		age = 22;
		
		switch (age) {
		
		case 22:
			System.out.println(age >= 22 ? "You can workout" : "You are too young");
			break;
		case 2:
			System.out.println("You cannot workout");
			
		default:
			System.out.println("Are you a real person?");
		}
	}
}