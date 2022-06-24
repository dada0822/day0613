package day0613;

import java.util.Arrays;
import java.util.Comparator;
class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			 Comparable c1 = (Comparable) o1;
			 Comparable c2 = (Comparable) o2;
			 
			 return c1.compareTo(c2) * -1;
		 }
		 return -1;
	}
	
 }

public class Comparator1 {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 정렬할 때 대소문자 구분안함
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr = " + Arrays.toString(strArr));
	}

}
