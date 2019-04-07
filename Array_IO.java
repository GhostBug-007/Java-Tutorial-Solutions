import java.util.Scanner ;
public class Array_IO{
	public static void main(String [] args) {
		int [] a; 
		int i;
		a = new int[5] ;
		Scanner scan = new Scanner(System.in) ; 
		for (i= 0 ; i< a.length ; i++) 
		{
			a[i] = scan.nextInt() ; 
		}
		for (i=0 ; i< a.length ; i++)
		{
			System.out.print(a[i]) ;
		}
	}
}