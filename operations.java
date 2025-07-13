public class operations
{
	public static void main(String args[])
	{
		int arr[] = {11,8,28,17,2};
		System.out.println("Array Contains\n");
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i] + "\n");
		}

		int max=0, sum=0;
		for(int i=0;i<=4;i++)
		{	
			sum = sum + arr[i];

			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		System.out.println("Sum of All the numbers in Array: " + sum + "\n");
		System.out.println("Average of All Numbers in Array: " + (double)sum/arr.length + "\n");
		System.out.println("Largest Element in Array: " + max + "\n"); 

	}
}
