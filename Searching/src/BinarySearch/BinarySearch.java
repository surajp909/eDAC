package BinarySearch;

public class BinarySearch {
	
	static String binarySearch(int arr[],int data)
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(arr[mid]==data)
				return "element found";
			if(data<arr[mid])
				r=mid-1;
			else
				l=mid+1;
				
			
		}
		return "element not found";
	}

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,9};
		System.out.println(binarySearch(arr, 4));
		

	}

}
