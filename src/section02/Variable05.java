package section02;

import java.math.BigDecimal;

/*
 * 데이터 표현 방식
 * 정수표현
 * 		컴퓨터는 2진수로 표현bit
 * 		 부호비트 Most Significant Bit + 수치비트
 * 		음의 값을 표현할 떄 2의 보수 표현
 * 
 * 실수 표현
 * 		부동소수 표현 
 * 		지수부 (e)비트 + 가수부(m) 비트
 * 	실수 표현 수식
 * 		± (1.m)*2^(e-127)                              ; ㄷ + 한자 
 * 		부동소수점 오차 (위의 식을 볼때 컴퓨터는 실수를 정확히 표현할 수 없고 근사치로 인식)
 * 			정확한 실수 표현 불가능 근사치 값으로 인해 생긴 오차
 * 
 *  
 *
 */ 



public class Variable05 {
	public static void main(String[] args) {
		float f = 0.0f;
		double d = 0.0;
		BigDecimal bd = new BigDecimal(0.0);
		
		//for 반복문 
		for(int i = 0; i<100; i++) { //i++ = i+1 
						
			f +=0.1f; //f= f + 0.1f
			d+= 0.1;				//오차가 적음, 돈 관련된 건 d로, 절삭,,, 
			bd = bd.add(new BigDecimal(0.1));
			
					
		}
		
		System.out.println(f);
		System.out.println(d);
		
		
		
	}
	
	
	

}










