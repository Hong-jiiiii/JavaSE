package section10.access1;

public class FruitLatte extends Latte{
	public String fruit;
	public String origin;
	
	
	
	@Override		//어노테이션 - 클래스, 메서드, 필드 등 추가적인 메타정보 제공 
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		//super : 부모를 참조하는 키워드. 삭제하면 해당메서드를 새롭게 정의하는 꼴.
		System.out.println("Fruit: "+ fruit);
		System.out.println("Origin: " + origin);
	}
}
