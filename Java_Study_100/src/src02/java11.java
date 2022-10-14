package src02;

public class java11 {

	public static void main(String[] args) {
		// [ ! ] : 관계 연산자 --> ==, !=, >, >=, <, <=
		// 관계 연산자를 사용해서 연산을 수행하면 그 결과는 참(true), 거짓(false)이 된다. --> 따라서, 그 결과를 받는 타입은 boolean.
		int kor=70, eng=40, math=70;
		boolean rst1, rst2, rst3, rst4, rst5, rst6;
		
		rst1 = kor == eng;		// false
		rst2 = kor != eng;		// true
		rst3 = kor > eng;		// true
		rst4 = kor >= math;		// true
		rst5 = kor < eng;		// false
		rst6 = kor <= math;		// true
		
		System.out.println( rst1+ "\t" +rst2+ "\t" +rst3+ "\t" +rst4+ "\t" +rst5+ "\t" +rst6 );
		
	}

}
