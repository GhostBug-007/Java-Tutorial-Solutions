import java.util.Scanner ;
public class PatternMatcher{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in) ;
		String mainStr = sc.nextLine() ;
		String pattern = sc.nextLine() ;

		int pos = mainStr.indexOf(pattern) ;
		while(pos != -1)
		{
			System.out.println("Pattern found at " + pos);
			pos = mainStr.indexOf(pattern, pos+1) ;
		}
	}
}