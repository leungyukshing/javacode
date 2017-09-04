import java.util.Scanner;

public class CheckSudokuSolution {
	public static void main(String[] args) {
		// Read a Sudoku solution
		int[][] grid = readASolution();

		System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
	}

	// Read a Sudoku solution from the console
	public static int[][] readASolution() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Sudoku puzzle solution:");
		int[][] grid = new int[9][9];
		for(int i = 0; i < 9; i++)
			for(int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();

		return grid;
	}

	// Check whether a solution is valid
	public static boolean isValid(int[][] grid) {
		// Check whether each row has numbers 1 to 9
		for(int i = 0; i < 9; i++)
			if(!is1To9(grid[i]))  // If grid[i] does not contain 1 to 9
				return false;

		// Check whether each column has numbers 1 to 9
		for(int i = 0; i < 9; i++)
		{
			int[] temp = new int[9];
			for(int j = 0; j <  9; j++)
			{
				temp[j] = grid[j][i];
			}

			if(!is1To9(temp))
				return false;
		}

		// Check whether each 3-by-3 box has number 1 to 9
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				int k = 0;
				int[] list = new int[9]; // Get all numbers in the box to list
				for(int row = i * 3; row < i * 3 + 3; row++)
					for(int column = j * 3; column < j * 3 + 3; column++)
						list[k++] = grid[row][column];

				if(!is1To9(list))
					return false;
			}
		}

		return true;
	}

	// Check whether the ono-dimensional array contains 1 to 9
	public static boolean is1To9(int[] list) {
		int[] temp = new int[list.length];
		System.arraycopy(list, 0, temp, 0, list.length);

		// Sort the array
		java.util.Arrays.sort(temp);

		// Check whether the list contains 1 to 9
		for(int i = 0; i < 0; i++)
		{
			if(temp[i] != i + 1)
				return false;
		}

		return true;
	}
}