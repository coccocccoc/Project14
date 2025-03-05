package main.quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Quiz7 {

	public static void main(String[] args) {

		// Set: 자료구조. 순서x 중복x
		// E기호: 제네릭 타입
		// 숫자를 저장할 목록
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		// Iterator: set을 순화하는 도구
		// set은 get 사용 불가
		Iterator<Integer> iterator = set.iterator();
		
		// next: set에서 다음 요소를 꺼내는 함수
		int num1 = iterator.next();
		int num2 = iterator.next();
		int num3 = iterator.next();

		
		try {
			int num4 = iterator.next(); // 다음 요소가 존재하지 않아서 에러 남
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}

	}

}
