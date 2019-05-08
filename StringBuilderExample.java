public class StringBuilderExample{
	public static void main(String [] args){
		StringBuilder sb = new StringBuilder("abc") ;
		sb.append("xyz") ;
		sb.append("fgh") ;
		System.out.println(sb);

		String s = "su" ;
		String t = "su" ;
		System.out.println(s == t);

		StringBuilder s1 = new StringBuilder("ab") ;
		StringBuilder s2 = new StringBuilder("ab") ;

		if(s1.toString().equals(s2.toString()))
			System.out.println("s1 = s2");
		else 
			System.out.println("s1 != s2");
	}
}