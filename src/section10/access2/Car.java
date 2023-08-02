package section10.access2;

public class Car {
	public String model;
	protected String color;
	int year;//default는 앞에 아무것도 쓰지 않는다.
	private String brand;
	

	public void getInfo() {
		System.out.println("Model: "+ model);
		System.out.println("Color: "+ color);
		System.out.println("Year: "+ year);
		System.out.println("Brand: "+ brand);  //ctrl + shift +x :대문자로 변환. ctrl +shift +y : 소문자로 변환.
	}
}
