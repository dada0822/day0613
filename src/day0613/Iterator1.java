package day0613;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		LinkedList list = new LinkedList();
		Collection list = new HashSet();
		
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i)); 
//		}
		
		Iterator it = list.iterator(); // list든 set이든 가능 
		
		// hasNext()를 한 번 사용하고 나면
		// 끝까지 이동하였으므로 다시 호출해도 처음으로 이동하지 않음
		// 그러므로 Iterator는 일회용
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
