package package1;

public class DuplicateValueInStringArray {

	public static void main(String[] args) {
		String[] S = new String[]{"Ram", "Sham", "Ram"};
		int StringLength = 	S.length;
	    for(int i = 0; i<StringLength;i++)
			
		{
			for(int j = i+1;j<StringLength;j++)
				
			{
				
				if(S[i]==(S[j]))
				{
				
					System.out.println("Duplicate Value=" +S[i]);
				}	
					
		}
			
	}
	
	}

}
