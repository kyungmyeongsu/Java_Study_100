// 정수로 이루어진 배열에서 가장 큰 값을 구하는 최솟값 알고리즘을 구현해보시오.
// 이 문제는 배열내 정수 값들에서 최솟값을 구하는 알고리즘에 대해서 아는지를 묻는 문제이다.

package src08;

public class java02 {

	public static void main(String[] args) {
		// [1] : 배열 선언
		int[] ar = { 4, -13, 150, 17, -2 };
		
		// [2] : max, min 함수
		System.out.println( Math.max( 10, 4 ) );	// 10
		System.out.println( Math.min( 10, 4 ) );	// 4
		
		// [3] : 일단 배열내 첫번째 원소의 값이 제일 작다고 가정하고 초기화
		int min = ar[0];
		
		// [4] : 반복문 돌면서 비교하여 출력 --> 이때, 비교는 2번째 부터 비교하면 되니깐 int i=1로 시작.
		System.out.println( "현재 배열내 가장 작은 값은 : " + min );

		for( int i=1; i < ar.length; i++ )
			if( min > ar[i] )
				min = ar[i];
		
		System.out.println( "현재 배열내 가장 작은 값은 : " + min );
	}

}
