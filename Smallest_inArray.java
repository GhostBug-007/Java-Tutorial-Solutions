import java.util.Scanner ; 
public class Smallest_inArray{
	public static void main(String [] args){
		int [] a;
		a = new int[6] ;
		Scanner scan = new Scanner(System.in) ; 
		for(int i = 0 ; i < a.length ; i++ ) 
			a[i] = scan.nextInt() ;
		int min = a[0] ; 
		for (int value : a) 
		{
			if (value < min)
				min = value ;
		}
		System.out.println(min) ;

	}
}