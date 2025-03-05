package main.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		String str = "1.23";
		
		// 1.23: 실수
		// Integer: 정수형 클래스
		// parse~ : 타입 변환 함수
		// parseInt: 문자열 -> 정수
		try {
			int num = Integer.parseInt(str); // 실수 -> 정수 변환
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}

}
