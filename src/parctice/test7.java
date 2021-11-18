package parctice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.org.apache.bcel.internal.classfile.SimpleElementValue;

public class test7 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date a=null;
		
//		System.out.println(a);
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		a=format.parse("20210829");
		System.out.println(a);
		Calendar c=Calendar.getInstance();
		c.setTime(a);
		c.add(Calendar.DATE,7);
		a=c.getTime();
		System.out.println(format.format(a));
	}

}
