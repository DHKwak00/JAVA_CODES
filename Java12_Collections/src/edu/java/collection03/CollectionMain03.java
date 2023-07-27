package edu.java.collection03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Collection<E> : 자료(데이터)를 저장하기 위한 Generic 클래스
// => List<E>, set<E>
// => Map<k, v>

// List<E>
// 1. 자료들이 저장되는 순서가 중요 -> 인덱스 사용
// 2. 중복된 값들의 저장을 허용

// List<E>
// => ArrayList<E>, LinkedList<E>

// ArrayList<E>
// 1. 내부적으로 배열 자료구조를 사용
// 2. 저장 용량을 늘리는데 많은 시간이 소요 - 단점
// 3. 저장된 데이터를 삭제하는데 많은 시간이 소요 - 단점
// 4. 데이터 참조(검색)할 때 매우 빠름 - 장점

// LinkedList<E>
// 1. 내부적으로 Linked List 자료 구조를 사용
// 2. 저장 용량을 늘리는 과정이 매우 간단 - 장점
// 3. 저장된 데이터를 삭제하는 과정이 매우 간단 - 장점
// 4. 데이터를 참조(검색)하는 시간이 매우 느임 - 단점

// ArrayList<E>, LinkedList<E>에서 사용되는 메소드
// - add(element), get(index), set(index, element), remove(index) 

public class CollectionMain03 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>(); // 다형성
		List<String> list2 = new ArrayList<>();
		list.add("목요일");
		list.add("입니다.");
		list.add("내일은");
		list.add("금요일입니다.");
		
		list.set(3, "주말입니다.");
		for(String x : list) { // for-each문을 쓰면 get메소드를 사용 안해도 된다.
			System.out.println(x);
		}
		
		list.remove(3);
		for(String x : list) {
			System.out.println(x);
		}
		
		
		

	} //end main()

} // end CollectionMain03










