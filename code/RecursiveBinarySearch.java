public class RecursiveBinarySearch {
	public static int recursiveBinarySearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		return recursiveBinarySearch(list, key, low, high);
	}

	public static int recursiveBinarySearch(int[] list, int key, int low, int high)
	{
		if(low > high)
			return - low - 1;

		int mid = (low + high) / 2;
		if(key < list[mid])
			return recursiveBinarySearch(list, key, low, mid - 1);
		else if(key == list[mid])
			return mid;
		else
			return recursiveBinarySearch(list, key, mid + 1, high);
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 4, 5, 7, 8, 9, 1000};
		System.out.println(recursiveBinarySearch(nums,7));
	}
}