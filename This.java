class Sample{
	private int value = 150 ; 

	public Sample(){
		this(1); 
	}

	public Sample(int n){
		System.out.println(n) ; 
	}
	public void set(int value){
		this.value = value ; 
	}

	public void print(){
		System.out.println(this.value) ; 
	}
}

public class This{
	public static void main(String [] args){
		Sample s1, s2; 
		s1 = new Sample() ; 
		s2 = new Sample(100) ; 
		s1.print() ; 
		s1.set(30) ; 
		s1.print(); 	

	}
}

