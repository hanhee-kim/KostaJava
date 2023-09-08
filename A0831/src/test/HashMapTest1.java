package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String,Integer> hmap = new HashMap<String, Integer>();
		hmap.put("1001", 35); //데이터 삽입(키,값)
		hmap.put("1002", 35);
		hmap.put("1003", 40);
		hmap.put("1004", 50);
//		hmap.put("1001", 80);	//key가 같기때문에 value가 변경됨
		
		if(hmap.containsKey("1001")== false) {	//key 존재 여부 확인
			hmap.put("1001", 80);	//key가 있는지 확인하고 값을 추가하면 기존 값이 변경되는 일이 없다.
		}
		
		Integer value = hmap.get("1001");	//키에 맞는 벨류 가져오는것
		System.out.println(value);
		System.out.println();
		
		for(Integer n : hmap.values()) {	//value를 전부 가져옴
			System.out.println(n);
		}
		
		for(String k : hmap.keySet()) {	//key를 전부 가져옴
			System.out.println(k);
		}
		
		for(String k : hmap.keySet()) { //키를 통해 값 가져오기
			System.out.println("key : "+k+"value : "+hmap.get(k));
		}
		
		for(Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(String.format("key:%s, value:%d", entry.getKey(),entry.getValue()));
		}
		
		hmap.remove("1001"); 	//1001를 키로 둔 객체가 삭제됨
		
		
	}
}
