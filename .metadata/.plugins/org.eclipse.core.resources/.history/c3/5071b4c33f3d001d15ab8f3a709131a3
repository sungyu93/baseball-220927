package strategy;

public class CoffeeMachine {
	// 상속을 쓰는 방법은 다형성을 성립하지 않기 때문에 쓰지 않는다.
	// 컴퍼지션을 하는 방법은 보통 생성자로 주입을 받는다. 하지만 지금은 간단하게 메서드로 주입받음.
	
	public void brew(Coffee coffee) {
		System.err.println(coffee.make());
	}
	// 이 코드는 카페라떼라는 새로운 캡슐이 만들어지면 원래 만들어져있는 coffemechine을 수정해야
	// 한다는 단점이 있다
	// 첫번째 방법: 오버로딩 (OCP 위배)
	// 두번째 방법: 인터페이스 사용
	// 이제 brew에 의존하게 되는 것이고 타겟이 두 개가 아니라 한 개(Coffee)가 된다.

}
