package RestAPI.RestAPI;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TryDuplicate {

	@Test
	public void test1() {
		/*Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
	    List<Integer> targetList = Arrays.asList(sourceArray);*/
		int[] ints = {1, 2, 3,3,2,1,4,2,3,5,5,5,3,4,34,43,32,32,32,43,43,43};
	Set<Integer> s1=new HashSet <Integer>(ints.length);
	Set<Integer> s2=new HashSet <Integer>(ints.length);
	for (int i : ints)
	{
		if(s1.add(i)==false)
			s2.add(i);
	}
	/*
	 * List<Integer> duplicates=new ArrayList<Integer>(s2);
	 * Collections.sort(duplicates);
	 * System.out.println("List of duplicate elements "+ duplicates);
	 */
 //   Set<Integer> alCoaches = new TreeSet<Integer>(s2);
    for(Integer i:ints)
System.out.print(i+"  ");
	}
}
