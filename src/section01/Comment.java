package section01;
/*
 * 주석
 * 	코드에 영향을 주지 않는 개발자가 사용하는 메모공간
 * 
 * 줄삭제: ctrl + d
 *	여러줄 주석
 * ctrl + f11: 실행 단축키
 * ctrl + /: 주석 단축키
 * alt + shift + j:JavaDoc 주석 단축키
 */


public class Comment {
public static void main(String[] args) {
	// 한줄 주석
	System.out.println("Hello, Java!");
	
	printNum(712);
	}	
/** JavaDoc 주석
 * 
 * 입력받은 정수 출력하는 메소드
 * 
 * @param num - 입력받은 정수
 *
 * 공신력있는 주석(누구나 마우스 올려놓으면 읽을 수 있는 주석)
 */
	 public static void printNum(int num) {
		 System.out.println("num: " + num);
	 }
}

  