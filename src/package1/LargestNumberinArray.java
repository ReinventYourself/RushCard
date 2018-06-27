package package1;

public class LargestNumberinArray {

	public static void main(String[] args) {
		
		int[] arr = {-1,-2,-1,-2,-3};
		int largest = arr[0]; 
		int smallest= arr[0];
		for(int i =0; i<arr.length;i++)
		{
			if (largest<arr[i])
				largest = arr[i]; 
		if (arr[i]<smallest)
			smallest = arr[i];
		
		}
		System.out.println(largest);
		System.out.println(smallest);
	
	}
	

}
