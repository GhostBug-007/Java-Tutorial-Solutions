public class Swap{
	public static void main(String [] args){
		int a , b, temp ;
		a=6; 
		b=10;
		temp = a ;
		a = b;  
		b = temp ;
		System.out.println("The value of a is "+ a +" and the value of b is "+ b) ; 

		int x= 7 , y = 3 ; 
		x = x+y ;
		y = x-y ; 
		x = x-y ; 
		System.out.println("The value of x is " + x + " and the value of y is "+ y) ; 
	}
}