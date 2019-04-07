class Base{
	 public void f(){
	 	System.out.println("f() in Base");
	 }
	 public void g() {
	 	System.out.println("g() in Base");
	 }
}

class Derived extends Base {

	//Override
	public void g(){
		System.out.println("g() in Derived");
	}

	public void h() {
		System.out.println("P() in Derived") ;
	}
}

public class Overriding {
	public static void main(String [] args){
		Base b1 = new Base() ; 
		b1.g() ; 	// is Base
		b1.f() ;	// is Base
		System.out.println();

		Derived d1 =new Derived() ; 
		d1.g(); 	// is derived
		d1.f() ; 	// is Base
		d1.h() ;	// is derived
		System.out.println();

		Base bd1 = new Derived() ; 
		bd1.g() ; 	// is derived
		bd1.f() ;	// is base
		System.out.println();

	}
}