package package1;

public class FibonacciSeries {

	public static void main(String[] args) {

	int	limit =23;
		int i=0, j =1, k=1;
	    System.out.print(i);
		while(k<=limit)
		{ System.out.print(" "+k);
			k = i+j;
			i=j;
			j=k;
		}
	}
}
