package com.yedam.chaper13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {

		// 앞에 <String, Integer> 적으면 뒤에 <> 넣어주지 않아도 자동으로 넣어짐. 키가 같아서 덮어씌워짐.
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 Entry 수 : " + map.size());
		//객체 찾기
		int score = map.get("홍길동");
		System.out.println("\t홍길동" + score);
		System.out.println();
		
		//모든 key값 가져오기 map에 있는 key만을 가져와 데이터 활용.
		Set<String> keySet = map.keySet();
		//map에 있는 키를 가져올때 쓰는것이 set
		Iterator<String> keyInterator = keySet.iterator();
		while(keyInterator.hasNext()) {
			//데이터가 있는지 확인 후 반복문을 실행.
			String key = keyInterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);	
		} // 내가 넣은 데이터에 대해 키와 벨류값을 확인할수 있음.
		
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println(map.size());
		
		//모든 k,v(Map.entry) 가져와서 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator
		= entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		for(Map.Entry<String, Integer>temp : map.entrySet()) {
			String key = temp.getKey();
			Integer value = temp.getValue();
			System.out.println("\t" + key + " : " + value);
			
		}
		
		System.out.println();
		
		map.clear();
		
		System.out.println("총 entry 수 : " + map.size());
		
		
		
		
	}
}
