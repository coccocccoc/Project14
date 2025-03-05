package main.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// String도 클래스
		// 인스턴스 없이 참조변수를 사용하면 에러남
		try {
			String str = null;
			System.out.println(str.length()); // "str" is null
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}

}
