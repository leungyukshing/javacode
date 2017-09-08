public class RecursiveSelectionSort {
	public static void sort(double[] list)
	{
		sort(list, 0, list.length - 1);
	}

	public static void sort(double[] list, int low, int high)
	{
		if(low < high)
		{
			// Find the smallest number and its index in list
			int indexOfMin = low;
			double min = list[low];
			for(int i = low + 1; i <= high; i++)
			{
				if(list[i] < min)
				{
					min = list[i];
					indexOfMin = i;
				}
			}
			// Swap the smallest in list(low .. high) with list(low)
			list[indexOfMin] = list[low];
			list[low] = min;

			// Sort the remaining list(low+1 .. high)
			sort(list, low + 1, high);
		}
	}

	public static void main(String[] args)
	{
		double[] nums = {1.1, 10.9, 2.2, 5.4, 3.1, 0.5};
		sort(nums, 0, 5);
		for(int i = 0; i < 6; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}