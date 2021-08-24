package linearSearch;

public class LinearSearch {

	static String linearSearch(int arr[],int data)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
				return "Element found";
		}
		return "Element not found";
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,1,6,10,9};
		System.out.println(linearSearch(arr, 10));

	}

}
