package a1;

public class NestedClassExample {

	public static void main(String[] args) {

		// 객체 myCar 생성
		Car myCar = new Car();
		
		
		//인스턴스 멤버 클래스의 객체 생성 -> 클래스명.인스턴스 멤버 클래스명 객체이름 = Car의 객체 myCar.new 인스턴스 멤버 클래스명();
		Car.tire tire = myCar.new tire();
				
		//정적 멤버 클래스의 객체 생성 -> 클래스명.정적 멤버 클래스명 객체이름 = new 클래스명.정적 멤버 클래스명();
		Car.Engine engine = new Car.Engine();

	}

}
