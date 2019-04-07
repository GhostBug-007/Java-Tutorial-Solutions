import java.util.Scanner ;
public class Largest_inArray{
	public static void main(String [] args){
		int [] a ;
		a = new int[5] ;
		Scanner scan = new Scanner(System.in) ; 
		int i ; 
		for (i= 0 ; i< 5 ; i++) 
			a[i] = scan.nextInt() ; 
		int max = a[0] ;
		while(i > 0) 
		{
			i-- ; 
			if (a[i] > max )
				max = a[i] ; 
		}
		System.out.println("The max value is "+ max) ; 
	}
}