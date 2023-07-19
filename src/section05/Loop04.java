package section05;
/*
 * 
 * 	중첩 for문
 * 	for문 안에 for문
 *  
 * 	형태: for (초기식 1;조건식 1;증감식 1){
 * 			 for (초기식 2; 조건식 2; 증감식 2){
 * 				초기식 2에 맞춰 반복수행할 코드}
 * 			초기식 1에 맞춰 반복수행할 코드}
 * 결과: 초기식 2에 맞춘 루프가 끝까지 실행 -> 초기식 1에 맞춘 루프 1단계 실행 
 * 			-> 초기식 2에 맞춘 루프가 끝까지 다시 실행 -> 초기식 1의 2번째 증감에 따른 루프 2단계 실행.... 초기식 1의 루프가 끝날때까지 반복.
 * 	
 * 
 */
public class Loop04 {
	public static void main(String[] args) {
		for(int i = 0; i<7; i++) {
			for(int j= 0; j<i+1; j++) {
			System.out.print("*");
		}
			System.out.println();
	}
}
}