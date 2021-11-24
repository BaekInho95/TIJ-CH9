package a2;

/*
 * 익명 객체 : 단독으로 생성할 수 없고 클래스를 상속하거나 인터페이스를 구현해야만 생성 가능
 * 
 * 필드의 초기값이나 로컬 변수의 초기값, 매개 변수의 매개값으로 주로 대입된다
 * 
 * 
 * 
 * */

public class Anonymous {
	// 필드 선언 시 초기값으로 익명 자식 객체를 생성해서 대입
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
		
	};
	// 로컬 변수를 선언할 때 초기값으로 익명 자식 객체를 생성해서 대입
	void method1() {
		Vehicle localVar = new Vehicle() {
		@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	// 메소드의 매개 변수가 부모 타입일 경우 호출 코드에서 익명 자식 객체를 생성해서 매개값으로 대입
	void method2(Vehicle v) {
		v.run();
	}

}
