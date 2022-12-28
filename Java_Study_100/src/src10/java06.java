// ArrayList를 이용한 자료의 추가, 수정, 삭제, 출력을 구현해보시오.
// 이 문제는 컬렉션 프레임워크의 ArrayList에 대한 사용법을 알고 있는지를 묻는 문제이다.

package src10;

import java.util.ArrayList;

public class java06 {

	public static void main(String[] args) {
		// [0] : ArrayList 객체 생성 --> 제네릭을 사용
		ArrayList<String> ar = new ArrayList<String>();
				
		// [1] : 추가 --> add()
		ar.add( "홍길동" );
		ar.add( "이순신" );
		ar.add( "강감찬" );
		ar.add( "을지문덕" );
		ar.add( "김유신" );
		System.out.println( ar.get(3) );  		// 을지문덕
		String str = ar.get(0);					// 형변환 없이 바로 사용 --> 타입 안전성↑
		// int num = (int)ar.get(0);			// 컴파일 단계에서 오류 발견
		
		// [2] : 수정 --> set( 인덱스, 수정값 )
		ar.set( 3, "징키스칸" );
		System.out.println( ar.get(3) );		// 징키스칸
		
		// [3] : 삭제 --> 2가지( 하나만 삭제 / 한꺼번에 삭제 ) --> remove( 인덱스 )
		ar.remove( 3 );
		System.out.println( "--------------------[삭제 후 출력]" );
		System.out.println( ar.get(0) );		// 홍길동
		System.out.println( ar.get(1) );		// 이순신
		System.out.println( ar.get(2) );		// 강감찬
		System.out.println( ar.get(3) ); 		// 김유신
		System.out.println( "--------------------[삭제 후 출력]" );
		
		// [4] : 출력1 --> 향상된 for문
		for( String str1 : ar )
			System.out.print( str1 + " " );
		System.out.println();
		
		// [5] : 출력2
		for( int i=0; i < ar.size(); i++ )
			System.out.printf( "%d번 학생의 이름은 %s 입니다.%n", (i+1), ar.get(i) );
			// System.out.println( ar.get(i) );
			
		// [6] : 한꺼번에 삭제 --> removeAll( 배열명 )
		ar.removeAll( ar );
		System.out.println( ar.size() );  		// 0
		System.out.println( "--------------------[전체 삭제 후 출력]" );
		for( String str2 : ar )
			System.out.println( str2 );
		System.out.println( "--------------------[전체 삭제 후 출력]" );
		
	}

}
