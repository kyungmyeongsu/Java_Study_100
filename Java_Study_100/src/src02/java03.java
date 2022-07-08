package src02;

public class java03 {

	public static void main(String[] args) {

		// [1]: 변수 선언
		int a;			//--- 정수가 저장될 변수 이름을 a로 만들어라 --;;
		int b; int c=90;
		double d;		//--- 실수가 저장될 변수 이름을 d로 만들어라 --;;
		char e;			//--- 문자가 저장될 변수 이름을 e로 만들어라 --;;
		
		// [2]: 선언된 변수에 값을 대입
		a = 10;
		b = 20;
		d = 10;			//--- 정수 1-을 입력하면 10.0으로 출력 --;;
		e = 'A';		//--- 쌍따옴표하면 에러 --;;
		
		// [3]: 출력
		System.out.println(a); //10
		System.out.println(b); //20
		System.out.println(c); //90
		System.out.println(d); //10.0
		System.out.println(e); //A
		
		// [4]: 여러개 변수 선언 및 초기화 --> 선언 후 값을 셋팅
		// [4-1]
		int w; 								// 에러 X -> 선언만 한 상태에서는 아무러 오류가 없다. 사용했을 때만 오류가 발생할 수 있다.
		//int x,y,z=900;						// z만 초기화가 되고 x,y는 초기화가 안됨.
		//System.out.println("[4-1]:"+z);		
		
		// [4-2]
		int x,y,z;
		x = 700;
		y = 800;
		z = 900;
		System.out.println("[4-2]:"+ x +" - "+ y +" - "+ z);
		
		// [4-3]
		int x1 = 300, y1 = 400, z1 = 500;
		System.out.println("[4-3]:"+ x1 +" - "+ y1 +" - "+ z1);
		
		// [4-4] : 같은 값으로 초기화
		//String str1, str2, str3 = "korea";
		//System.out.println(str3);
		
		String str1, str2, str3;
		str1= str2= str3="korea";
		System.out.println("[4-4] 여러 문자열 변수 한꺼번에 초기화:"+ str1 +" - "+ str2 +" - "+ str3);
		
		int i,j,k;
		i=j=k=100;
		System.out.println("[4-4] 여러 정수형 변수 한꺼번에 초기화:"+ i +" - "+ j +" - "+ k);
	}

}
