package day0613;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		// 6개의 랜덤수를 뽑음
		// set은 중복값이 저장되지 않으므로
		// num에서 중복값이 나온다 하더라도 set에는 저장되지 않음
		
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
//		set은 순서가 없으므로 sort를 사용할 수 없음
//		Collections.sort(set);
		
		// 그럼에도 정렬을 원한다면
		// set을 list로 옮겨서 정렬하고 저장해야 함
		
		// LinkedList(Collection c) 생성자 이용
		List list = new LinkedList(set);
		
		Collections.sort(list);

		
		System.out.println(list);
	}

}
