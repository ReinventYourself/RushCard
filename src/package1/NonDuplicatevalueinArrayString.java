package package1;
/*Bcd JKL
Total Unique Value=2*/
public class NonDuplicatevalueinArrayString {
public static void main(String[] args) {
	//String[] S = new String[] { "Abc", "Bcd", "Abc", "JKL" };
	int[] S = new int[]{1,2,3,8,6,1};
	
		int flag = 0;
		int count = 0;
		int length = S.length;
		for (int i = 0; i<length; i++){
			for (int j = 0; j<length; j++)
			{
				if (i != j)
				{ 
					if (S[i] != S[j]) 
				 {
						flag = 1;
				 }

			   else {

						flag	 = 0;
						break;
					}
				}
			}

			if (flag == 1) {
				count++;
				System.out.println(S[i]);
			}
		}
System.out.println("Total Unique Value=" + count);
}
}
