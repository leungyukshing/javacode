public class Calculator {
	public static void main(String[] args) {
		if(args.length != 3)
		{
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		int result = 0;

		int operand1 = Integer.parseInt(args[0]);
		int operand2 = Integer.parseInt(args[2]);
		switch(args[1].charAt(0))
		{
			case '+' : result = operand1 + operand2;break;
			case '-' : result = operand1 - operand2;break;
			case '*' : result = operand1 * operand2;break;
			case '/' : result = operand1 / operand2;
		}

		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}
}