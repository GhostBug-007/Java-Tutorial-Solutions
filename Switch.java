import java.util.Scanner ; 
public class Switch{
	public static void main(String [] args){
		int dayOfWeek ; 
		Scanner scan = new Scanner(System.in) ; 
		dayOfWeek = scan.nextInt(); 
		switch(dayOfWeek) 
		{
			case 1 : System.out.println("Monday") ;
					 break ;
			case 2 : System.out.println("Tuesday") ;
					 break ;
			case 3 : System.out.println("Wednesday") ;
					 break ;
			case 4 : System.out.println("Thursday") ;
					 break ;
			default : System.out.println("Check the input") ;

		}
	}
}