// 1부터 10 사이의 숫자가 무작위로 10개 출력되는 코드를 구현해보시오.
// 예시) [ 2, 3, 9, 8, 0, 8, 5, 7, 2, 1 ]
// 이때, 0은 출력되면 안된다.
// 이 문제는 랜덤 함수를 사용해서 무작위로 숫자를 출력할 수 있는지와 주의사항을 알고 있는지를 묻는 문제이다.

package src10;

public class java11 {

	public static void main(String[] args) {
		// [1] : 반복문 --> 랜덤 숫자 생성
		// 랜덤 숫자 생성중 0을 제외하려면? --> 결과로 나오는 숫자에 1을 더해준다.
		for( int i=0; i < 10; i++ ) {
			System.out.print( ((int)(Math.random() * 1000) + 1) + "\t" );
		}
		System.out.println();
		
	}

}
