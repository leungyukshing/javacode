import java.util.Scanner;

public class PayRoll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		int workedHours = input.nextInt();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxWithholdingRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxWithholdingRate = input.nextDouble();

		// Calculation
		double gross = workedHours * hourlyPayRate;
		double federalWithholding = gross * federalTaxWithholdingRate;
		double stateWithholding = gross * stateTaxWithholdingRate;
		double totalDeduction = federalWithholding + stateWithholding;
		double netPay = gross - totalDeduction;

		// Formatting
		gross = (int)(gross * 100) / 100.0;
		federalWithholding = (int)(federalWithholding * 100) / 100.0;
		stateWithholding = (int)(stateWithholding * 100) / 100.0;
		totalDeduction = (int)(totalDeduction * 100) / 100.0;
		netPay = (int)(netPay * 100) / 100.0;

		// Output
		System.out.println("Employee Name:  " + name);
		System.out.println("Hours Worked:  " + workedHours * 1.0);
		System.out.println("Pay Rate:  $" + hourlyPayRate);
		System.out.println("Gross Pay:  $" + gross);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + federalTaxWithholdingRate * 100 + "%):  $" + federalWithholding);
		System.out.println("  State Withholding (" + stateTaxWithholdingRate * 100 + "%):  $" + stateWithholding);
		System.out.println("Total Deduction:  $" + totalDeduction);
		System.out.println("Net Pay:  $" + netPay);
	}
}