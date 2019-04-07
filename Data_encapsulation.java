import java.util.Scanner ;
class Account{
	public double balance = 0 ; 

	public void debit(double amount)
	{
		if (amount > 0 && amount <= balance )
			balance -= amount ; 
	}

	public void credit(double amount) 
	{
		if (amount > 0)
			balance += amount ;
	}
	public void showBalance()
	{
		System.out.println("The balance is "+balance) ; 
	}
}

public class Data_encapsulation{
	public static void main(String [] args){
		Account a1 ; 
		a1 = new Account(); 
		Scanner scan = new Scanner(System.in) ; 
		a1.credit(scan.nextInt()) ;
		a1.debit(scan.nextInt()) ; 
		a1.showBalance() ;
		a1.balance = 2000 ;
		a1.showBalance();
	}
}