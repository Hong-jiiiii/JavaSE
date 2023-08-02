package section09;

public class Book {
	
	//속성
	public String title;
	public int price;
	public int totalpage;
	public String author;
	
	public Book() { //생성자.
					//클래스가 실행되어 힙영역에 저장될 때
					//우선적으로 실행되어
		
					//디폴트값으로 적용.
		this.title = "멘토씨리즈 자바";
		this.price = 32000;
		this.totalpage = 603;
		this.author = "김영우";
	}
	
	public void getInfo() {
		System.out.println("title: "+ title);
		System.out.println("price: "+ price);
		System.out.println("totalpage: "+ totalpage);
		System.out.println("author: "+ author);
	}
	
	
}
