import java.util.Scanner; 
class Searching {
	public int search(int a[] , int x) {
		return search(a ,x , 0); 
	}

	public int search(int a[] , int x , int start){
		for (int i=start ; i < a.length; i++)
		{
			if (a[i] == x)
				return i ; 
		}
		return -1 ;
	}
}

class Need_methodOverloading{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in) ; 
		Searching se1 = new Searching() ; 
		int [] array ; 
		System.out.println("Input the size of the array") ; 
		int x = scan.nextInt() ; 
		array = new int[x];
		System.out.println("Input the  array") ; 
		for(int i=0 ; i<x ; i++)
		{
			array[i] = scan.nextInt() ;
		}
		System.out.println("Enter the number you want to search") ;
		int value = scan.nextInt() ;
		int a,b;
		a= se1.search(array , value);
		b= se1.search(array,value , 3) ;

		System.out.println(a+ " " + b);

	}
}