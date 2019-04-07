class Sample {
	public String toString(){
		return "Hello" ;
	}
}

public class Object_Class {
	public static void main(String [] args){
		Sample s = new Sample() ; 
		System.out.println(s.toString()) ;
	}
}