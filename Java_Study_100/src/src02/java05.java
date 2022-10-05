package src02;

public class java05 {

	public static void main(String[] args) {
		// [1]
		short a = 'A';
		System.out.println( a );  //--- A(65) + (26-1) = Z(90)
		
		// [2]
		short b = 90;
		System.out.println( (char)b );  //--- Z
		
		// [3]
		char c = 'z';
		System.out.println( (short)c );  //--- a(97) + (26-1) = z(122)
	}

}

// 아스키코드 테이블 순서 : A(65) , a(97) **알아두기**