// 컬렉션 프레임워크의 ArrayList 기반으로 2차원 배열을 만들어 요소를 추가하고 출력해보시오.
// 이 문제는 제법 까다로운 문제로서, ArrayList를 이용한 2차원 배열에 대한 개념을 잘 알고 있는지를 묻는 문제이다.
// 배열과 2차원에 대한 개념이 약하면 거의 풀지 못하므로, 사전에 일반 배열과 2차원 배열에 대한 선학습을 많이 해주고 강의를 보도록 한다.

package src10;

import java.util.ArrayList;

public class java07 {

	public static void main(String[] args) {
		// [1] : 객체 생성
		ArrayList<Integer[]> arr =  new ArrayList<Integer[]>();
		
		// [2] : 요소 추가 --> add()
		arr.add( new Integer[]{ 11, 12, 13, 14 } );
		arr.add( new Integer[]{ 21, 22, 23, 24 } );
		arr.add( new Integer[]{ 31, 32, 33, 34 } );
		
		// [3] : 요소 출력
		for( int i=0; i < arr.size(); i++ )
			System.out.println( arr.get(i)[0] );  // 11(0번째 배열의 첫 번째 값), 21(1번째 배열의 첫 번째 값), 31(2번째 배열의 첫 번째 값)
		
		// [4] : 전체 요소 출력 --> 이중 반복문 --> 그런데, 그전에 안쪽 배열의 사이즈를 미리 체크 --> 여기서 약간 주의!
		// System.out.println( arr.get(0).size() );		//--- Err	--> 컬렉션 프레임워크 타입의 길이를 알고 싶을 때 사용.
		// System.out.println( arr.get(0).length() );		//--- Err	--> 문자열의 길이를 알고 싶을 때 사용.
		// System.out.println( arr.get(0).length );		//--- 4	--> 배열( int[], Integer[], String[] )의 길이를 알고 싶을 때 사용.
		
		// [5] : 전체 요소 출력
		System.out.println( "-------------------------------[전체 요소 출력]" );
		for( int i=0; i < arr.size(); i++ ) {
			for( int j=0; j < arr.get(i).length; j++ )
				System.out.print( arr.get(i)[j] + " " );
			System.out.println();
		}			
		System.out.println( "-------------------------------[전체 요소 출력]" );
		
	}

}
