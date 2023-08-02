package section06;
/*
 * 숙제
 * [i][j] -> [세로][가로]
 * 1 (1,1) 2(1,2) 8(2,1) 15(3,1) 9(2,2) 3(1,3) 4(1,4) 10(2,3) 16(3,2) 22(4,1) 
 *   [1] [2] [3] [4] [5] [6] [7]
 * [1] 1  2   3   4   5   6   7
 * [2] 8  9   10  11  12  13  14
 * [3] 15 16  17  18  19  20  21
 * [4] 22 23  24  25  26  27  28
 * [5] 29 30  31  32  33  34  35
 * [6] 36 37  38  39  40  41  42
 * [7] 43 44  45  46  47  48  49
 * 
 * 1.2중배열 선언하고
 * 2. for 문으로 1~49까지 대입하기
 * 3. 아래 모양으로 출력하기
 * 
 * 
 * 
 * 
 * 
 */
public class ArrayHomework {
	public static void main(String[] args) {
		int[][] nums = new int[7][7];
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				nums[i][j] =(j+1)+(i*7);
				
				
			
			}
			
					
			
		}
	
	for(int f = 0; f<nums.length; f ++) {
		for(int k = 0; k<nums[f].length;k++) {
			System.out.print(nums[f][k]+" ");
			}
		System.out.println();
		
		
//	for(int index = 0; index<7; index++) {
//		if (index%2 == 1) {
//			for(int num1 = index; num1>0; num1--)
//				for(int num2 = )
//			System.out.println(nums);
		}
	}
	
		
	
			
	
		}
	}
}
