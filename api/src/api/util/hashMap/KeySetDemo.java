package api.util.hashMap;

/*import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;*/
import java.util.*;

public class KeySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 *  Map 에 값을 입력하는 경우=> 1가지만 존재
		 * */
		map.put("김연아", new Integer(98));
		map.put("아사다 마오", new Integer(66));
		map.put("소트니 코바", new Integer(10));
		
		/*
		 * GoF 의 디자인 패턴 중에서
		 * Iterator 패턴이라고 불리우는
		 * Map 에서 값을 추출하는 정규화된 패턴이다.
		 * */
		
		/*
		 * 맵에서 키값과 밸류값의 맵핑 현황을 전부 출력할때는
		 * entrySet() 사용
		 * 맵에서 키값만 출력할 경우
		 * keySet() 사용
		 * 단, 어느 경우든지 Set 이용
		 * 이유는..컬렉션에서
		 * 인터페이스는 Set, List, Map 세가지 대표적인데..
		 * Set 과 Map 은 인덱스 값이 없어서 상호 호환이 잘되고
		 * Set 은 중복값 제거 기능이 있어서
		 * Map 에서 키값으로 중복이 없어야 하는 부분과도 일치해
		 * Set 을 통해 키값,혹은 키+밸류값을 출력하는데 쓰인다.
		 * 참고로 맵은 Iterator 가 없어서 
		 * Set 의 Iterator 를 사용하기 위함이다.
		 * */
		
		/*
		 * Map 에서 값을 출력하는 경우는 3가지인데..
		 * 첫번째는 키 + 밸류 형태로 함께 출력하는 경우
		 * entrySet() + Iterator 패턴 사용
		 * */
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("참가자 :" + e.getKey()+", 점수:" + e.getValue());
		}
		
		/*
		 * Map 에서 값을 출력하는 경우는 3가지인데..
		 * 두번째는 키 들만 출력하는 경우
		 * keySet() 사용
		 * */
		set = map.keySet();
		System.out.println("참가자 명단 :" + set);
		
		/*
		 * Map 에서 값을 출력하는 경우는 3가지인데..
		 * 세번째는 밸류(값) 들만 출력하는 경우
		 * Collection 사용
		 * */
		// Collection 에서 이클립스 제안 중에서 java.util.Collection 선택
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("총점 :" + total);
		// Set 도 List 계열의 클래스처럼 요소의 갯수를 size() 로 한다.
		System.out.println("평균 :" + total/set.size());
		// Collections.max 는 최대값, .min 은 최소값을 리턴한다.
		System.out.println("1등 :" + Collections.max(values));
		System.out.println("꼴등 :" + Collections.min(values));
		
		
	}
}
