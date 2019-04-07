abstract class Base{
	public abstract void f() ;
	public abstract void g() ;

	public void h() {
		System.out.println("h() in base()");
	}
}

abstract class Derived extends Base{
	public void f(){
		System.out.println("f() in Derived");
	}
	// public void g() {
	// 	System.out.println("g() in Derived");
	// }
}

class Derived1 extends Derived {
	public void g(){
		System.out.println("g() in Derived1");
	}
}

public class Abstract_classExtra{
	public static void main(String [] args){
		Base b = new Derived1(); 
		b.g();
		b.f(); 
		b.h(); 

		Derived d = new Derived1() ;
		d.g();
		d.f();
		d.h();

		Derived1 d1 = new Derived1() ;
		d1.g();
		d1.f() ;
		d1.h() ;

	}
}