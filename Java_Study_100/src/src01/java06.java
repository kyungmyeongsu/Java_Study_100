package src01;

public class java06 {

	public static void main(String[] args) {
		int a; //--- 정수가 저장될 변수 이름을 a로 만들어라--;;
		int b;
		int sum;
		
		a = 3;
		b = 4;
		sum = a + b;
		
		System.out.println(sum);
		
		sum = a + b + a;
		System.out.println(sum);

	}

}

/*
[1] : 변수란 무엇인가? --> 바구니다. --> 데이터를 저장하는 메모리 공간이다. --> 변하는 수. (변수<=>상수)

[2] : 변수 선언이란 무엇인가? --> 변수를 사용하기 위해서는 먼저 변수의 타입에 맞는 선언을 해줘야 한다.
정수형의 변수를 사용하고자 한다면 --> 먼저 정수형 타입의 자료형을 선언해주고 사용해야한다. --> 데이터타입(자료형)에 대해서는 뒤에..

[3] : 변수의 용도? --> 저장 --> 어떤 연산을 수행할  값들을저장해놓아야 하는데 그때 변수(바구니)를 활용한다.

[4] : 왜 필요한가?
public static void main(String[] args) {
	int a; //--- 정수가 저장될 변수 이름을 a로 만들어라--;;
	int b;
	int sum;
	
	a = 3;
	b = 4;
	sum = a + b;
	
	System.out.println(sum);
	
	sum = a + b + a;
	System.out.println(sum);

}

*/