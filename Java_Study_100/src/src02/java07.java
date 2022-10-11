package src02;

//[ ! ] : 바꾸는 이유?
//정수형끼리의 연산이 아닌 경우 더하기 연산 등을 수행했을 때 문자가 합쳐지는 결과가 나올 수 있기 때문.
//연산 외에도 메서드 호출시 인자값을 정수로 보내서 문자열로 처리하는 또는 반환하는 경우에도 필요.
//변환하는 방법은 여러가지가 있다.

public class java07 {

	public static void main(String[] args) {
		// [1] : 정수 선언
		int a = 12345;
		String str = "12345";
		// System.out.println( a.length() );				// Err
		System.out.println( "[1] --> " + str.length() );  	// 5
		
		// [2] : 정수 --> 문자열로 변환 --> 자릿수 구하기
		String stra = String.valueOf( a );
		System.out.println( "[2] --> " + stra.length() );  	// 5
		
		// [3] : 문자열 + 정수형 = ?
		System.out.println( "[3] --> " + (12345+1) );  	// 12346
		System.out.println( "[3] --> " + (str+1) );			// 12345+1 = 123451
				
		// [4] : 문자열 --> 정수로 변환
		int b = Integer.valueOf( str );
		System.out.println( "[4] --> " + (b + 1) );			// 12346

	}

}
