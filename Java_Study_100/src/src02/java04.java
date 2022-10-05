package src02;

public class java04 {

	public static void main(String[] args) {
		// [1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 7000000000L;
		float f = 9.8F;
		double d = 3.14;	
		char c = 'A';		
		boolean bl = false;
	
		// [2] : 출력
		System.out.println( b + " byte 최댓값 --> " + Byte.MAX_VALUE );
		System.out.println( s + " short 최댓값 --> " + Short.MAX_VALUE );
		System.out.println( i + " int 최댓값 --> " + Integer.MAX_VALUE );
		System.out.println( l );
		System.out.println( f );
		System.out.println( d );
		System.out.println( c );
		System.out.println( bl );

	}

}
