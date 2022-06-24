package day0613;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i] + " = " + set.add(objArr[i]));
		}	
		System.out.println(set);// 중복되는 값을 저장하지 않음

		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}