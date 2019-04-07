class Vehicle{

}
class TwoWheeler extends Vehicle{

}
class FourWheeler extends Vehicle{

}
class Bike extends TwoWheeler{

}
class Car extends FourWheeler{

}
class Human{}

public class Object_Class_general {
	public static void test(Vehicle v){ 		// Giving the base class as the 
												// parameter makes it compatible 	
	}											//with all the child classes but if we
										// want that the arguement to take any class 
										//then we can give (Object) class as the arguement as 
										//it is the base class for all the classes
	public static void main(String [] args){	
		test (new Vehicle()) ; 
		test (new TwoWheeler()) ;
		test(new FourWheeler()) ;
		test(new Bike()) ;
		test(new Car()) ;  
	}
}

class Base {
	public Vehicle getVehicle(){
		return null ;
	}
}
class Derived extends Base {

	@Override
	public Bike getVehicle(){
		return null ; 
	}
}