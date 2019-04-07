import java.util.Scanner ;
public class PrimeNumber_efficient{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in) ; 
		int n ; 
		n = scan.nextInt() ; 
		boolean prime = true ;
		double sqt = (int)Math.sqrt(n) ; 
		for (int i=2; i <= sqt ; i++)
		{
			if (n % i == 0)
				prime = false;
		}
		if (prime)
			System.out.println("It is a prime number") ;
		else 
			System.out.println("It is not a prime number") ; 
	}
}
