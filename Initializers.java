class Sample{
	static{
		System.out.println("Static Initializers");
	}
	static{
		System.out.println("Static Initializers 1") ;
	}
	{
		System.out.println("Non-static Initializers") ;
	}
	{
		System.out.println("Non-static Initializers 1") ;
	}

}

public class Initializers{
	public static void main(String [] args) {
		Sample s1 = new Sample() ; 
		Sample s2 = new Sample() ; 
		Sample s3 = new Sample() ; 
	}
}