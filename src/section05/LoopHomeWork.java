package section05;

/*
 * 2번
 * 		*
 * 	   **
 *    ***
 *   ****
 *  *****
 *  
 *  3번
 *     *
 *    ***
 *   *****
 *  *******
 *  
 *  4번
 *      *
 *     ***
 *    *****
 *   *******
 *    *****
 *     ***
 *      *
 *    
 * 만들기
 * 
 * 5번
 * 2x1=2 3x1=3 4x1=4
 * 세단씩 잘라서 9단까지 완성하기
 * 
 */
public class LoopHomeWork {

	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
