package day0613;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		int[] score = {80,95,60,26,49,35,100};
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set); // 알아서 정렬되어서 들어감
		
//		System.out.println("60보다 작은 값 " + set.headSet(60));
//		System.out.println("60보다 큰 값 " + set.tailSet(60));
		
//		System.out.println("60보다 큰 값 " + set.ceiling(65));
//		System.out.println("60보다 작은 값 " + set.floor(65));
		
		System.out.println("60보다 작은 값 " + set.lower(6));
		System.out.println("60보다 큰 값 " + set.higher(6));
		
	}

}
