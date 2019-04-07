class Bike{
	boolean powerOn ;
	int speed ; 

	void start(){
		powerOn = true ;
		speed = 0; 
	}

	void stop(){
		powerOn = false ;
		speed = 0;
	}

	void acceleration(int newSpeed){
		speed = newSpeed ;
	}

	void printState(){
		System.out.println("Current State:- ");
		System.out.println("Power- "+powerOn);
		System.out.println("Speed- "+speed);
	}
}

public class Classes{
	public static void main(String [] args){
		Bike b1,b2 ;
		b1 = new Bike();
		b2 = new Bike();

		b1.start(); 
		b2.start(); 

		b1.acceleration(50) ;

		b1.printState(); 
		b2.printState(); 
	}
}