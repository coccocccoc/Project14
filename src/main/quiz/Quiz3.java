package main.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// Object 클래스는 모든 클래스의 부모이므로
		// 모든 인스턴스를 저장할 수 있다
//		try {
//			Object object = new Integer(0);
//			String str = (String)object; // 잘못된 다운캐스팅
//		} catch (ClassCastException e) {
//			e.printStackTrace();
//		}
		
		Object object = new Integer(0);
		
		if(object instanceof String) { // 타입 체크
			String str = (String)object; // 다운캐스팅
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}

}
