class Sample{
	public int  sum(int ... a){
		int result = 0 ; 
		for (int i=0 ; i<a.length; i++)
		{
			result += a[i] ; 
		}
		return result ; 
	}
}

class Ellipsis_Overloading{
	public static void main(String [] args){
		Sample s1 = new Sample() ;
		int x =s1.sum(10,30,20,40) ; 
		System.out.println(x) ; 
	}	
}