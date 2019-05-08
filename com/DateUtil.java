package com.utils ;

import java.text.SimpleDateFormat ;
import java.util.Date ;

public class DateUtil{
	public static String getFormattedDate(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
		return sdf.format(d) ;
	}
}