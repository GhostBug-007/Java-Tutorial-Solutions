// Constructors in inheritance
class Point2d {
	protected int x, y ; 

	public Point2d() {
		this.x = 1 ; 
	}

	public Point2d(int x ,int y){
		this.x = x ;
		this.y = y ; 
	}

	public void print(){
		System.out.printf(" (%d , %d) \n", x,y);
	}
}

class Point3d extends Point2d{
	private int z ; 

	public Point3d(){

	}

	public Point3d(int x , int y, int z) {
		super(x,y) ;
		this.z = z ; 
	}

	public void print() {
		System.out.printf(" (%d , %d , %d) \n", x,y,z);
	}
}

public class Super_keywordExample{
	public static void main(String [] args){
		Point2d p1 = new Point2d() ; 
		p1.print() ; 
		Point2d p2 = new Point2d(10,20) ; 
		p2.print() ;
		System.out.println();

		Point3d p3 ,p4 ;
		p3 = new Point3d () ; 
		p4 = new Point3d(10,20,30) ; 
		p3.print() ; 
		p4.print() ; 
	}
}