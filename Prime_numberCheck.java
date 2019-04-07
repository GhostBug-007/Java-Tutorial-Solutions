import java.util.Scanner; 
public class Prime_numberCheck{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in) ; 
		int n , count = 0 ;
		n = input.nextInt() ; 
		for (int i = 2 ; i < n ; i++)
		{
			if (n % i != 0 )
				continue; 
			else
			{
				count++ ; 
				break ;
			}
		} 
		if(count > 0 )
		{
			System.out.println("It is not a prime number") ; 
		}
		else 
			System.out.println("It is a prime number") ;
	}
}