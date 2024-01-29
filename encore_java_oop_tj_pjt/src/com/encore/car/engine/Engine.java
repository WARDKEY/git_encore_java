package com.encore.car.engine;	//다른 패키지의 클래스 불러오기

public class Engine {
	
	private String engineType ;
	
	// 생성자 또는 메서드는 매개변수 타입과 개수를 달리해서 재 정의할 수 있다.
	// 생성자 오러로딩, 메서드 오버로딩
	// 생성자는 매개변수로 받은 값을 전역(멤버)변수에 할당하는 역할을 한다. 
	public Engine() {
		
	}
	public Engine(String engineType) {	// 생성자 오버로딩, 지정된 멤버변수 초기화
		this.engineType = engineType ;	// this 는 멤버변수를 가리킨다.
	}
	
	public String showInfo() {
		
		return "엔진의 타입은 "+engineType+"입니다." ;
	}
}
