public class Printing_primes{
	public static void main(String [] args){
		int n = 2 ; 
		while(n <= 200)
		{
			int i = 2 ,count=0; 
			while(i < n) 
			{
				if (n % i == 0)
				{
					count++ ; 
					break ;
				}
				i++ ; 
			}
			if (count == 0)
				System.out.println(n) ;
			n++ ;
		}
	}
}