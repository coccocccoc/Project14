package main.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// Book 클래스를 찾을 수 없어서 에러가 남
		
		try {
			Book book = new Book();
		} catch (NoClassDefFoundError e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}

}


class Book {
	
}