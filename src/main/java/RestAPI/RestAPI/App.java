package RestAPI.RestAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String stringv= "test1,abc,efg";
		String str[] = stringv.split(",");
		List<String> myList = new ArrayList<String>();
		myList=Arrays.asList(str);
		/*
		 * Iterator<String> it= myList.iterator(); while(it.hasNext())
		 */
		for(String s : myList)
		System.out.println(s);
    }
}
