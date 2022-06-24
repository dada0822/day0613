package day0613;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Test {}

public class TreeSet1 {
	public static void main(String[] args) {
		Set set = new TreeSet(new TestComp()); // 범위 검색, 정렬 유리
		
//		for(int i=0; set.size()<6; i++) {
//			int num = (int)(Math.random() *45)+1;
//			set.add(num);
//		}
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());		
		
		System.out.println(set);
	}
}

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
//		return -1;
//		return 1;
	}
	
}