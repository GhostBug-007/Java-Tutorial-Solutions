import java.util.Scanner ; 
public class Billing{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in) ; 
		System.out.println("Enter the final Billing Amount: ") ;
		double amount = input.nextDouble() ; 
		if(amount > 1000)
			amount = amount - (10*amount/100) ; 
		else 
			amount = amount - (5*amount/100) ;
		System.out.println("The final discounted Bill Amount is Rs "+ (int)amount) ; 
		

	}
}