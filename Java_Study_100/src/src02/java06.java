package src02;

public class java06 {

	public static void main(String[] args) {
		// [1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력
		byte b = 10;
		short s = 32767;
		int i = 2100000000;
		long l = 7000000000L;
		float f = 9.8F;
		double d = 3.14;	
		char c = 'A';		
		boolean bl = false;
		
		// [2] : print(), println()
		System.out.println( "안녕하세요~" );
		System.out.println( "홍길동입니다. 나는 학생입니다." );
		
		// [3] : printf() 출력 --> 지시자를 사용
		// %d(정수), %f(소숫점 형식), %c(문자), %s(문자열), %b(부울), %n(줄바꿈), %e(지수), %o(8진수), %x(16진수)
		System.out.printf( "나는 %d살의 대학생입니다. %d, %d, %d 소숫점 형식 --> %.1f , %.2f , 문자 --> %c , %b %n", b, s, i, l, f, d, c, bl );
		System.out.printf( "10진수 10은 8진수로는 %o 이고, 16진수로는 %x 이다.", b, 15 );
		System.out.println();
	}

}
