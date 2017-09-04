import java.util.Scanner; // Scanner is in the java.util package


public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Entera  a number for radius: ");
		double radius = input.nextDouble();
		double area = 0;

		area = radius * radius * 3.14159;

		System.out.println("The area for the circle of radius " +
			radius + " is " + area);
	}
}