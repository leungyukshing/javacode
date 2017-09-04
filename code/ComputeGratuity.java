import java.util.Scanner;

public class ComputeGratuity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate:");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		gratuityRate /= 100.0;

		double gratuity = gratuityRate * subtotal;
		double total = subtotal + gratuity;

		gratuity = (int)(gratuity * 100) / 100.0;
		total = (int)(total * 100) / 100.0;
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}
}