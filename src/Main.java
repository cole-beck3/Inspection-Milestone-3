import java.util.Scanner;
import java.util.Random;

// Cole Beck
		// This project is an attempt at a Daily Optimizer, a program used to help me plan out my day while utilizing my time at maximum efficiency
		// Operator precedence refers to how operators are parsed compared to each other. Higher precedence operators are executed before its counterparts.
public class Main {

	public static void main(String[] args) {
		
		Overloading object1 = new Overloading();
		Overloading object2 = new Overloading();
		Overloading object3 = new Overloading();
		Overloading object4 = new Overloading();
		
		object1.print(24);
		object2.print(3.1415);
		object3.print("Very well, thanks for asking");
		object4.print(100, 101);
					
		int numUsers = 1; //initialization
		
		// a class is like a blueprint
		// an object is an instance of a class
		// a variable is a location of memory
		// a scope defines where variables can be accessed from
		// inheritance is the ability for one class to reach other classes
			//its benefits include: one superclass can be used for all subclasses, all changes can be done in one place, avoids duplicate code, reduces complexity
		// polymorphism is "the ability of an object to take different forms" (Great Learning Team https://www.mygreatlearning.com/blog/polymorphism-in-java/)
		
		User cole = new User();
		cole.age = 22;
		cole.sleep = 7.5;
		cole.gender = "Male";

		System.out.println("User Program");
		
		Scanner input = new Scanner(System.in);
		Naming nameObject = new Naming ();
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		nameObject.simpleMessage(name);
		
		Random dice = new Random();
		int numberDice;
		
		for(int counter=1; counter<=3;counter++) {
			numberDice = 1+dice.nextInt(2);
			System.out.println(numberDice);
			//Random object is only used once but is still considered a bug
		}
		
	}
		
		public static double avgHoursWorkingOut(double a, double b) {
			double avg = (a+b)/2.0;
			return avg;
			
		// The method call is avgHoursWorkingOut
		// the arguments are double a, and double b
		// public is the header
	}
}
	
/*
 * // byte: The byte data type is an 8-bit signed two's complement integer. It
 * has a minimum value of -128 and a maximum value of 127 (inclusive). The byte
 * data type can be useful for saving memory in large arrays, where the memory
 * savings actually matters. They can also be used in place of int where their
 * limits help to clarify your code; the fact that a variable's range is limited
 * can serve as a form of documentation.
 *
 * short: The short data type is a 16-bit signed two's complement integer. It
 * has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As
 * with byte, the same guidelines apply: you can use a short to save memory in
 * large arrays, in situations where the memory savings actually matters.
 *
 * int: By default, the int data type is a 32-bit signed two's complement
 * integer, which has a minimum value of -231 and a maximum value of 231-1. In
 * Java SE 8 and later, you can use the int data type to represent an unsigned
 * 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.
 * Use the Integer class to use int data type as an unsigned integer. See the
 * section The Number Classes for more information. Static methods like
 * compareUnsigned, divideUnsigned etc have been added to the Integer class to
 * support the arithmetic operations for unsigned integers.
 *
 * long: The long data type is a 64-bit two's complement integer. The signed
 * long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8
 * and later, you can use the long data type to represent an unsigned 64-bit
 * long, which has a minimum value of 0 and a maximum value of 264-1. Use this
 * data type when you need a range of values wider than those provided by int.
 * The Long class also contains methods like compareUnsigned, divideUnsigned etc
 * to support arithmetic operations for unsigned long.
 *
 * float: The float data type is a single-precision 32-bit IEEE 754 floating
 * point. Its range of values is beyond the scope of this discussion, but is
 * specified in the Floating-Point Types, Formats, and Values section of the
 * Java Language Specification. As with the recommendations for byte and short,
 * use a float (instead of double) if you need to save memory in large arrays of
 * floating point numbers. This data type should never be used for precise
 * values, such as currency. For that, you will need to use the
 * java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and
 * other useful classes provided by the Java platform.
 * 
 * double: The double data type is a double-precision 64-bit IEEE 754 floating
 * point. Its range of values is beyond the scope of this discussion, but is
 * specified in the Floating-Point Types, Formats, and Values section of the
 * Java Language Specification. For decimal values, this data type is generally
 * the default choice. As mentioned above, this data type should never be used
 * for precise values, such as currency.
 * 
 * boolean: The boolean data type has only two possible values: true and false.
 * Use this data type for simple flags that track true/false conditions. This
 * data type represents one bit of information, but its "size" isn't something
 * that's precisely defined.
 * 
 * char: The char data type is a single 16-bit Unicode character. It has a
 * minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535
 * inclusive).
 */