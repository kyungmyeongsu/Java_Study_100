// 아래의 메서드 구현 코드에서 틀린 곳을 찾아 올바르게 수정하시오.
// 이 문제는 자바의 메서드 구현시 기본적인 주의점에 대해서 아는지를 묻는 문제이다.
// 참고로 이 문제는 클래스와 객체에 대한 선행 학습이 필요하므로 이에 대한 학습 후 본 문제를 다시 풀어보는 것이 좋다.
// 클래스명.메서드명();

package src05;

public class java05 {

	// [1]
	/*public static void helloWorld() {
		System.out.println( "Hello, World~ ^_^" );
	}*/
	
	// [2]
	public void helloWorld() {
		System.out.println( "Hello, World~ ^_^" );
	}
	
	public static void main(String[] args) {
		
		// [1] : 메서드 호출
		//helloWorld(); //--- 메인 메서드는 static 메서드만 호출할 수 있기 때문에 에러
		
		// [2] : 객체 생성 후 메서드 호출
		java05 jes = new java05();
		jes.helloWorld();
		
	}

}
