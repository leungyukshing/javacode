import java.util.Scanner;

public class Decimal2HexConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();

		System.out.println("The hex number of decimal " + decimal + " is " + decimalToHex(decimal));
	}

	public static String decimalToHex(int decimal) {
		String hex = "";

		while (decimal != 0) {
			int hexVale = decimal % 16;
			hex = toHexChar(hexVale) + hex;
			decimal /= 16;
		}
		return hex;
	}

	public static char toHexChar(int hexVale) {
		if(hexVale <= 9 && hexVale >= 0)
			return (char)(hexVale + '0');
		else
			return (char)(hexVale - 10 + 'A');
	}
}