package section05;

/*
 *   5번
 * 2x1=2 3x1=3 4x1=4
 * 세단씩 잘라서 9단까지 완성하기
 * 
 * 
 * 
 */

public class LoopHomeWork2 {
	public static void main(String[] args) {
		
		for(int k =0; k<3; k++) {
		for(int i = 1; i<10; i++ ) {
			for(int j= 2; j<5; j++) {
				int dan = j+(k*3);
				if (dan>9) break;
				
			
				System.out.printf("%d X %d = %d\t",dan,i,dan*i);
			}
			
			System.out.println();
			}
	
		System.out.println();
		}
}
}