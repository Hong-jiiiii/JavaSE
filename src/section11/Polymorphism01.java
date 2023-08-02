package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * 다형성(Polymorphism)
 * 	같은 인터페이스 또는 부모클래스를 공유하는 객체가
 * 	여러 유형의 타입을 가질 수 있는 기능.
 * 
 */
public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.drive();
		bus.bell();
		
		Car car = new Bus();
		car.drive();//실행가능 car에도 같은 메서드가 있고, 이후 객체가 bus이므로 bus의 메서드가 실행
		//car.bell(); 컴파일 자체가 안됨. car 타입에는 bell메서드가 없으므로.
		
		Bus bus2= (Bus) car;//car와 bus2는 같은 객체를 참조하고 있음 (bus)
		bus2.drive();
		bus2.bell();
	}

}
