package package1;

import java.util.Arrays;

public class Arraysort2 {

	public static void main(String[] args) {

		int[] arr = {1,8,9,5,7};
		
		Arrays.sort(arr);
		/*int temp=0;;
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				 temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				}
				}
			}
		*/
		for(int k  =0; k<arr.length;k++)
			System.out.println(arr[k]);
	
	}

}
