import java.util.Scanner ; 
public class NcR{
	static int factorial(int x){
		int i = 1, fact =1; 
		while(i <= x)
		{
			fact*= i; 
			i++ ;
		}
		return fact ;
	}

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the value of n") ;
		int n = scan.nextInt() ;
		// System.out.println("Enter the value of r") ;
		// int r = scan.nextInt() ;
		int finalValue = 0, imm , r=0; 
		int nFact =1 , rFact = 1 , nrFact; 
		nFact = factorial(n);
		while (r <= n)
		{
			rFact = factorial(r);
			nrFact = factorial(n-r) ;
			imm = nFact/(rFact * nrFact) ;
			finalValue = finalValue +  imm ; 
			r++ ;
		}
		System.out.println("\n"+finalValue) ;
	}
}