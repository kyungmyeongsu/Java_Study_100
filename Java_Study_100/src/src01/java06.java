package src01;

public class java06 {

	public static void main(String[] args) {
		int a; //--- ������ ����� ���� �̸��� a�� ������--;;
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
[1] : ������ �����ΰ�? --> �ٱ��ϴ�. --> �����͸� �����ϴ� �޸� �����̴�. --> ���ϴ� ��. (����<=>���)

[2] : ���� �����̶� �����ΰ�? --> ������ ����ϱ� ���ؼ��� ���� ������ Ÿ�Կ� �´� ������ ����� �Ѵ�.
�������� ������ ����ϰ��� �Ѵٸ� --> ���� ������ Ÿ���� �ڷ����� �������ְ� ����ؾ��Ѵ�. --> ������Ÿ��(�ڷ���)�� ���ؼ��� �ڿ�..

[3] : ������ �뵵? --> ���� --> � ������ ������ �� �����������س��ƾ� �ϴµ� �׶� ����(�ٱ���)�� Ȱ���Ѵ�.

[4] : �� �ʿ��Ѱ�?
public static void main(String[] args) {
	int a; //--- ������ ����� ���� �̸��� a�� ������--;;
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