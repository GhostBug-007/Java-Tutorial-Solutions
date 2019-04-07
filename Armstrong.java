public class Armstrong{
	public static void main(String [] args){
		int n = 2;
		for(; n <= 200; n++)
		{
			int sum = 0 , a; 
			int x = n ; 
			while(x >= 1)
			{
				a = x % 10 ; 
				sum += a*a*a;
				x = x/10 ; 
			}
			if(sum == n)
				System.out.println(n) ; 
		}
	}
}