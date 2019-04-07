final class Base{				// final class can't be inherited
	public void f(){			// if a method is final it can't be overridden

	}
}

class Derived extends Base{
	@Override
	public void f(){

	}
}

public class FinalModifier{

	public static final double PI = 3.14159 ;

	public static void main(String [] args){

	}
}