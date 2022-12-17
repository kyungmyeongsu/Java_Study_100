package src06;

//클래스에서 상속이란 무엇인지 상속의 정의와 특징을 말해보시오.
//이 문제는 자바 OOP 문법에서 상속에 대한 개념과 특징들에 대해서 알고 있는지를 묻는 문제이다.


//[1] : 상속(Inheritance)이란?
//말 그대로 부모 클래스가 가지고 있는 속성(변수)들과 동작/기능(메서드)들을 그대로 물려받아 새로운 클래스를 만드는 것.
//상속을 활용하면 물려받은 것들은 그대로 쓰면 되고, 거기에 덧붙여 새로운 것만 만들면 되므로 그만큼 노력과 시간이 세이브됨.
//이때, 물려받게 되는 원본 클래스를 부모 클래스(Parent class) 또는 슈퍼 클래스(Super class)라고 부른다.
//상속받아 새롭게 만들어진 클래스는 말 그대로 자식 클래스(Child class) 또는 서브/하위 클래스(Sub class)라고 부른다.
//또 다른 표현으로는 기초/기반 클래스(Base class), 파생 클래스(Derived class)라고도 부른다. --> derived : (a)유래된, 파생된


//[2] : 상속의 장점
//가장 큰 장점 --> 재활용성~!!
//완전히 새로운 것을 만드는 것이 아니라 기존 부모로 부터 상속을 받아 필요한 것만 추가로 더해서 만드는 것.
//부모 클래스에 정의되어져 있는 멤버 필드(변수)나 메서드 들을 그대로 상속받아 사용하면 된다.
//상속받은 메서드라 해도 필요에 따라서 자식 클래스에서 용도를 변경해서 사용하는 것도 가능.


//[3] : 상속의 사용
//기존 부모 클래스를 확장한다는 개념 --> extends 키워드 사용.
//부모 클래스의 멤버 필드, 메서드는 상속이 가능하나 생성자는 상속이 안된다.
//부모 클래스의 접근 제한자 private인 경우에는 아무리 자식 클래스가 상속을 받았다 하더라도 접근 불가능.