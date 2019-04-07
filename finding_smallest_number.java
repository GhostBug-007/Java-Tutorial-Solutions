import java.util.Scanner ; 
public class finding_smallest_number{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in) ; 
		float a, b,c, d ;
		a = (float)scan.nextFloat() ; 
		b = (float)scan.nextFloat() ; 
		c = (float)scan.nextFloat() ; 
		d = (float)scan.nextFloat() ; 
		if (a > b) 
		{
			if (a > c) 
			{
				if (a > d) 
					System.out.println("A is greatest") ; 
				else
					System.out.println("D is greatest") ; 
			}
			else
			{
				if (c > d)
					System.out.println("C is greatest") ; 
				else 
					System.out.println("D is greatest") ; 
			}
		}
		else
		{
			if (b > c) 
			{
				if (b > d) 
					System.out.println("B is greatest") ; 
				else
					System.out.println("D is greatest") ; 
			}
			else
			{
				if (c > d)
					System.out.println("C is greatest") ; 
				else 
					System.out.println("D is greatest") ; 
			}
		}
	}
}