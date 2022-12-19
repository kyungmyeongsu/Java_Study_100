// 객체에 대한 참조값을 요소로 가지는 객체 배열 코드를 구현하시오.
// 이 문제는 기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체 배열을 구현할 수 있는지를 묻는 문제이다.

package src06;

class Person4 {
	// Field
	private String name;
	private int age;
	
	// Constructor
	Person4() {}
	Person4( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	public String getName() { return name; }
	public void setName( String name ) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge( int age ) { this.age = age; }
}

public class java13 {

	public static void main(String[] args) {
		// [1] : 객체 생성
		int[] ar1 = { 1, 2, 3, 4, 5 };
		char[] ar2 = { 'A', 'B', 'C', 'D', 'E' };	
		Person4[] pa = new Person4[5];
		pa[0] = new Person4( "홍길동", 20 );
		pa[1] = new Person4( "박길동", 21 );
		pa[2] = new Person4( "김길동", 22 );
		pa[3] = new Person4( "장길동", 23 );
		pa[4] = new Person4( "고길동", 24 );		
		
		// [2] : 출력
		for( int i=0; i < pa.length; i++ ) {
			// System.out.print( pa[i].name + "\t\t" );
			System.out.print( pa[i].getName() + "\t\t" );
		}
		System.out.println();
	}

}
