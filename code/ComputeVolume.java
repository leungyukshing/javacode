import java.util.Scanner;

public class ComputeVolume {
	public static void main(String[] args) {
		final double PI = 3.14159;

		System.out.print("Enter the radius and length of a cylinder: ");

		Scanner input = new Scanner(System.in);

		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * PI;
		double volume = area * length;

		System.out.println("The area is " + area + "\nThe volunme is " + volume);
	}
}