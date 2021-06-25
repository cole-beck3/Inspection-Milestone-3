//Cole Beck
public class Overloading {
		
		public void print(int number) {
			System.out.println("Overload One");
			System.out.println("How many hours in a day?: " + number);
}
		public void print(double number) {
			System.out.println("Overload two");
			System.out.println("Number for Pi: " + number);
		}
		public void print(String text) {
			System.out.println("Overload three");
			System.out.println("How is your day going?: " + text);
		}
		public void print(int number1, int number2) {
			System.out.println("Overload four");
			System.out.println("Number #1: " + number1 + " Number #2: " + number2);
		}
}