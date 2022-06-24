package day0613;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZ");
		set.add("dzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set); // 알아서 정렬해서 화면 상에 보여줌
		System.out.println("range search : from " + from + " to " + to);
		
		// subSet : treeset에서 전체 중 일부분만 표시
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		
	}

}
