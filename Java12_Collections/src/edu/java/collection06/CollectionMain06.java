package edu.java.collection06;

import java.util.Set;
import java.util.TreeMap;

// list<E>, Set<E>: 한 가지 타입의 데이터를 저장할 수 있는 COllection

// Map<k, V> : key - value 쌍으로 데이터를 저장하는 구조
//				 1. Key는 중복되지 않는 값만 저장 가능
//				 2, Value는 중복된 값도 저장 가능
//				 3. 검색, 수정, 삭제할 때 Key값을 사용

// HashMap<K, V> : 검색을 빠르게 하기 위한 hash 알고리즘이 적용된 Map
// TreeMap<K, V> : 정렬을 빠르게 하기 위한 tree 알고리즘이 적용된 Map
public class CollectionMain06 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// Map<K, V>에 데이터 저장 : put(key, value);
		map.put(16, "황의조");
		map.put(7, "손흥민");
		map.put(18, "이승우");
		System.out.println(map);
		
		// map<K, V>의 데이터 하나 검색 : get(key)
		// - 해당 key 값의 value를 리턴
		System.out.println(map.get(7));
		System.out.println(map.get(16));
		System.out.println(map.get(18));
		
		System.out.println();
		//  Map<K, V>에서 데이터를 수정 : put(key, value)
		map.put(7, "김민재");
		System.out.println(map.get(7));
		
		System.out.println();
		 // Map<K, v>에서 데이터를 삭제 : remove(key)
		map.remove(7);
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>에서 key들로만 이루어진 Set을 생성 : keySet()
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		for(Integer e : keySet) {
			System.out.println(map.get(e));
			
		}
	
	} // end main()

} // end CollectionMain06
