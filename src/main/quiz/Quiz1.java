package main.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 나누기 연산에서 나누는 값으로 0을 쓰면 ArithmeticException 에러 발생
		
		try {
			int num = 5 / 0 ;
		} catch (ArrayIndexOutOfBoundsException e) {
			// e: 에러
			// 에러메시지 출력
			System.out.println(e);
		} catch (Exception e) { // 최상위 에러 클래스
			// 실제로 발생한 에러: ArithmeticException
			// Exception e = ArithmeticException
			// 부모타입 변수 = 자식 인스턴스
			// Exception 변수는 모든 에러를 받을 수 있다
			System.out.println(e); // 에러메시지(원인)만 출력
			e.printStackTrace(); // 에러메시지와 에러가 발생한 코드의 위치까지 표시
		}
		// 에러가 발생했을 때 에러와 일치하는 catch 블록을 찾는다
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
	}

}
