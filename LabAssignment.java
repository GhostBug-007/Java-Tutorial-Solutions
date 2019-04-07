import java.util.* ; 

class numberList{

	int [] a ;
	int size, i ;  
	public Scanner scan = new Scanner(System.in);

	numberList(){
		System.out.println("How many elements do you wish to enter") ; 
		size = scan.nextInt() ;
		System.out.println("size entered is " + size) ; 
		a = new int[size] ; 
	}

	public void input(){
		System.out.println("Give Input") ;
		for(i=0 ; i<size ; i++) 
		{
			a[i] = scan.nextInt() ;
		}
		System.out.println("Task Completed") ; 
	}

	public void sort(){
		System.out.println("Sorting started....") ;

		for(i=0 ; i<size ; i++)
		{	
			int min = i ; 
			for(int j=i+1 ; j<size ; i++)
			{
				if (a[j] < a[min])
					min = j ; 
			}
			int temp ;
			temp = a[i] ; 
			a[i] = a[min]; 
			a[min] = temp ;
		}
		System.out.println("Sorting completed") ;
	}

	public int search(int x){
		for(i=0 ; i< size ; i++) 
		{
			if (a[i] == x)
				return i ;
		}
		return -1 ;
	}

	public void duplicate() {
		for (i=1 ; i < size ; i++)
		{
			for (int j=i+1 ; j < size ; j++)
			{
				if (a[i] == a[j])
					System.out.print(a[j]+" @ index "+j) ;
			}
			System.out.println("") ;
		}
	}

	public int fibonacci(){
		if (a[0] != 0 || a[1] == 1)
			return 0 ;
		for (i = 2 ; i < size ; i++)
		{
			if (a[i] == a[i-1] + a[i-2]) 
				continue ; 
			else 
				return 0 ;
		}
		return 1 ;
	}

	public void square() {
		double sqroot ; 
		for (i = 0 ; i < size ; i ++) 
		{
			sqroot= Math.sqrt(a[i]);
			if (sqroot % 1 == 0 )
				System.out.println(a[i]+" is a perfect Square Number") ;
		}
	}
}


public class LabAssignment{
	public static void main(String [] args){
		numberList nl = new numberList() ; 
		nl.input(); 
		// nl.sort() ;
		int temp = nl.search(nl.scan.nextInt()) ;
		if (temp >= 0)
			System.out.println("The Index of the searched element is "+ temp) ; 
		else
			System.out.println("Element not found");
		nl.duplicate() ; 
		temp = nl.fibonacci() ;
		if (temp == 1) 
			System.out.println("It is a fibonacci series") ;
		else 
			System.out.println("It is not a fibonacci series") ; 
		nl.square() ;
	}
}