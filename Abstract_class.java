class Graphic{
	protected int x1, y1; 
	protected int x2, y2 ; 

	public void setStart(int x, int y){
		x1 = x ;
		y1 = y ;
	}

	public void setEnd(int x , int y){
		x2 = x ; 
		y2 = y ;
	}

	public void draw(){
		System.out.println("No Clue");
	}
}

class Line extends Graphic{

	@Override
	public void draw(){
		System.out.printf("draw line from (%d, %d), (%d, %d) \n", x1, y1, x2, y2);
	}
}

class Rectangle extends Graphic {
	@Override 
	public void draw(){
		System.out.printf("draw Rectangle from (%d , %d) to (%d, %d) %n", x1, y1, x2, y2);
	}
}

public class Abstract_class{

	static void drawUtil(int x1, int y1, int x2, int y2, Graphic g) {
		g.setStart(x1,y1) ;
		g.setEnd(x2,y2) ;
		g.draw() ;
	}

	public static void main(String [] args){
		drawUtil(10,30,40,50,new Graphic()) ;
		drawUtil(40,20,50,25, new Line()) ;
		drawUtil(40,20,50,25, new Rectangle()) ;

		Graphic g = new Graphic() ;
		g.setStart(1,1) ;
		g.setEnd(5,5) ; 
		g.draw() ;

		Line l = new Line() ;
		l.setStart(10,30) ;
		l.setEnd(40,50) ;
		l.draw() ; 

		Rectangle r = new Rectangle() ;
		r.setStart(10,20) ;
		r.setEnd(30,40) ; 
		r.draw() ;

	}
}
