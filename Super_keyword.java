class Base{
	public void print(){
		System.out.print("Hello  ");
	}
}

class Derived extends Base {
	// Override
	@Override
	public void print(){
		super.print() ; 	// takes to the parent class print() method 
		System.out.print("  World  ");
	}

}

public class Super_keyword{
	public static void main(String [] args){
		Base b1 = new Base() ; 
		b1.print() ; 

		Derived d1 = new Derived() ; 
		d1.print() ; 
	}
}