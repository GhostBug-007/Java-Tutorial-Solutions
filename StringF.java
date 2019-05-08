public class StringF{
	public static void main(String [] args){
		String s1 = "abc" ;
		String s2 = "ABC" ;

		if(s1.equals(s2)){
			System.out.println("s1 = s2");
		}
		else {
			System.out.println("s1 != s2");
		}

		if(s1.equalsIgnoreCase(s2))
			System.out.println(s1==s2); 
	}
}