import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Enter yearly interst rate
		System.out.print("Enter yearly interest rate, for example 8.25: ");

		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		// Enter number of years
		System.out.print("Enter number of years as an integer, for example 5: ");

		int nubmerOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount, for example 120000.95: ");

		double loanAmount = input.nextDouble();

		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow((1 + monthlyInterestRate), nubmerOfYears * 12));
		double totalPayment = monthlyPayment * nubmerOfYears * 12;

		// Display results
		System.out.println("The monthly payment is " + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is " + (int)(totalPayment * 100) / 100.0);
	}
}