package package1;

public class PrimeNumberUptoLimit {

public static void primelimit(int limit)
       
	{
		for(int i = 2;i<=limit; i++)
		{
			int j;
			for(j =2;j<=i;j++)
			{
				if(i%j==0)
					break;
				
			}
			
			if(i==j)
				System.out.println(i);
		}

	}

public static void main(String[] args) {
	
	primelimit(2);
}


}
