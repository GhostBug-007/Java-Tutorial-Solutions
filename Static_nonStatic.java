class Mymath{
	public static int add(int a, int b){
		return a+b ; 
	}
	public static int sub(int a , int b) {
		return a-b ;
	}
}

class Sample{
	int value ; 

	public void set(int x){
		value = x ;
	}
	public int get() {
		return value ;
	}
}

public class Static_nonStatic{
	public static void main(String [] args){
		Mymath math = new Mymath() ;
		int x = Mymath.add(4,7) ; 
		System.out.println(x) ;
		x= Mymath.sub(6,2) ;
		System.out.println(x) ;

		Sample obj= new Sample() ; 
		obj.set(10) ;
		System.out.println(obj.get()) ;
	}
}