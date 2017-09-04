import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Generate two random single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// Promise number1 > number2
		if(number1 < number2)
		{
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// Output
		System.out.print("What is " + number1 + " - " + number2 + "?");
		int answer = input.nextInt();

		if(number1 - number2 == answer)
		{
			System.out.println("You are correct!");
		}
		else
		{
			System.out.println("Your answer is wrong\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}
}