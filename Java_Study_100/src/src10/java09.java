// Iterator 개념과 이를 이용하여 ArrayList 요소를 순회 및 삭제하는 코드를 구현해보시오.
// 이 문제는 Iterator에 대한 개념과 사용법 그리고 ArrayList에서 사용할 수 있는지를 묻는 문제이다.
// 선학습으로 추상 클래스, 인터페이스, 다형성 등등의 OOP 개념이 있어야 한다.

package src10;

import java.util.ArrayList;
import java.util.Iterator;

public class java09 {

	public static void main(String[] args) {
		// [1] : 객체 생성
		ArrayList<String> list = new ArrayList<>();
		
		// [2] : 요소 추가 --> add()
		list.add( "Alligator" );
		list.add( "Hippo" );
		list.add( "Ostrich" );
		list.add( "Donkey" );
		
		// [3] : Iterator(반복자) 객체 생성 --> 객체 생성 과정도 중요!
		// System.out.println( hasNext() );  				// Err
		// Collection 인터페이스 --> iterator() 메서드를 정의하고 있고 --> 이를 상속받는게 List, Set 인터페이스이므로,
		// List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 iterator() 메서드를 사용할 수 있음.
		Iterator<String> iter = list.iterator();
		
		// [4] : Iterator(반복자) 메서드 사용 --> hasNext(), next(), remove()
		// System.out.println( iter.hasNext() );			// true --> 왜? --> 첫 번째 요소인 악어가 있으니깐..
		// System.out.println( iter.next() );				// Alligator
		// System.out.println( iter.hasNext() );			// true --> 왜? --> 두 번째 요소인 하마가 있으니깐..
		// System.out.println( iter.next() );				// Hippo
		// System.out.println( iter.hasNext() );			// true --> 왜? --> 세 번째 요소인 타조가 있으니깐..
		// System.out.println( iter.next() );				// Ostrich
		// System.out.println( iter.hasNext() );			// true --> 왜? --> 네 번째 요소인 당나귀가 있으니깐..
		// System.out.println( iter.next() );				// Donkey
		// System.out.println( iter.hasNext() );			// false
		// System.out.println( iter.next() );				// Err
		
		// [5] : 요소 출력 --> 향상된 for문
		for( String s : list )
			System.out.println( s );
		
		// [6] : 요소 출력 --> while 반복문 사용
		// (문제 속의 문제1) --> 배열 요소 전체를 출력해보시오.
		// (문제 속의 문제2) --> 아래의 출력 결과를 예상하여 말해보시오?--> 아무것도 안나온다. --> 이게 정답.
		// (문제 속의 문제3) --> Hippo 요소만 출력해보시오.
		// (문제 속의 문제4) --> Hippo 요소만 삭제해보시오.
		System.out.println( "--------------------------------[Iterator(반복자)로 출력]" );
		while( iter.hasNext() ) {
			String str = iter.next();
			if( "Hippo".equals(str) ) {
				iter.remove();
				System.out.println( "하마 삭제" );
			}
			// System.out.println( iter.next() );
		}
		System.out.println( "--------------------------------[Iterator(반복자)로 출력]" );
		
		for( String s : list )
			System.out.println( s );
		
	}

}
