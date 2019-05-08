import java.util.Date ;

import com.DateUtil ;
import com.Vehicle ;


class Main_Package{
	public static void main(String [] args){
		Vehicle v1 = new Vehicle() ;
		v1.wheels() ;

		DateUtil d1 = new DateUtil() ;
		String formattedDate = d1.getFormattedDate(new Date()) ;
		System.out.println(formattedDate) ;
	}
}