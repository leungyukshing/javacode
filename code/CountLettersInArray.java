public class CountLettersInArray {
	public static void main(String[] args) {
		char[] chars = createArray();

		// Display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);

		// Count the occurrences of each letter
		int[] counts = countLetters(chars);

		// Display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}

	// Create an array of characters
	public static char[] createArray() {
		char[] chars = new char[100];

		for(int i = 0; i < chars.length; i++)
		{
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}

		return chars;
	}

	// Display the array of characters
	public static void displayArray(char[] chars) {
		for(int i = 0; i < chars.length; i++)
		{
			if((i +  1) % 20 == 0) // 20 characters per row
			{
				System.out.println(chars[i]);
			}
			else
				System.out.print(chars[i] + " ");
		}
	}

	// Count the occurances of each letter
	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];

		for(int i = 0; i < counts.length; i++)
		{
			counts[chars[i] - 'a']++;
		}
		return counts;
	}

	// Display counts
	public static void displayCounts(int[] counts) {
		for(int i =0; i < counts.length; i++)
		{
			if((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
		}
		System.out.println();
	}
}