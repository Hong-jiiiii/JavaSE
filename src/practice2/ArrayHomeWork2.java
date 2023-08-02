package practice2;

import java.util.Scanner;

/*
 * 숙제
 * [i][j] -> [세로][가로]
 * 0 1(0,0) 
 * 1 2(0 1) 8(1 0) 
 * 2 15(2 0) 9(1 1) 3(0 2) 
 * 3 4(0 3) 10(1 2) 16(2 1) 22(3 0)
 * 4 29(4 0) 23(3 1) 17(2 2) 11(1 3) 5(0 4)
 * 5 6(0 5) 12(1 4) 18(2 3) 24(3 2) 30(4 1) 36(5 0)
 * 6 43(6 0) 37(5 1) 31(4 2) 25(3 3) 19(2 4) 13(1 5) 7(0 6)
 * 7 14(1 6) 20(2 5) 26(3 4) 32(4 3) 38(5 2) 44(6 1)
 * 8 45(6 2) 39(5 3) 33(4 4) 27(3 5) 21(2 6)
 * 9 28(3 6) 34(4 5) 40(5 4) 46(6 3)
 * 10 47(6 4) 41(5 5) 35(4 6)
 * 11 42(5 6) 48(6 5)
 * 12 49(6 6)
 * 
 * 
 * 
 * 
 *   [0] [1] [2] [3] [4] [5] [6]
 * [0] 1  2   3   4   5   6   7
 * [1] 8  9   10  11  12  13  14
 * [2] 15 16  17  18  19  20  21
 * [3] 22 23  24  25  26  27  28
 * [4] 29 30  31  32  33  34  35
 * [5] 36 37  38  39  40  41  42
 * [6] 43 44  45  46  47  48  49
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


public class ArrayHomeWork2 {
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("2이상의 정수를 입력해주세요.");
		num = scanner.nextInt();
		
		
		
		int[][] nums = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				nums[i][j] =(j+1)+(i*num);
				
				
			
			}
			
					
			
		}
	
		for(int f = 0; f<nums.length; f ++) {
			for(int k = 0; k<nums[f].length;k++) {
				System.out.print(nums[f][k]+" ");
			}
			System.out.println();}
			
			
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		if(num%2==1) {
		for(int a =0; a<num; a++) {
				//홀수행
			if(a==0) {System.out.print(nums[0][0]);}
			else if(a%2==1){
				for(int b=0;b<=a;b++)
				for(int c=a;c>=0;c--) 
					if(b+c==a)
					System.out.print(nums[b][c]+" ");
						
					}
			else {
				for(int b=0;b<=a;b++)
				for(int c=a;c>=0;c--)
					if(b+c==a)
						System.out.print(nums[c][b]+" ");
		}
			System.out.println();
	}
		
		for(int a=num;a<num*2;a++)
		for(int d=0;d<num;d++)
			if(a-d==num) {
				if(a%2==1) {
					for(int b = d;b<=num-1;b++)
						for(int c = num-1;c>=d;c--)
							if(b+c==a)
								System.out.print(nums[b][c]+" ");}
				else if(a%2==0) {
					for(int b = d;b<=num-1;b++)
						for(int c = num-1;c>=d;c--)
							if(b+c==a)
								System.out.print(nums[c][b]+" ");
						
					}
			System.out.println();		
			}
		
		}
		
		else {
			for(int a =0; a<num; a++) {
					//홀수행
				if(a==0) {System.out.print(nums[0][0]);}
				else if(a%2==1){
					for(int b=0;b<=a;b++)
					for(int c=a;c>=0;c--) 
						if(b+c==a)
						System.out.print(nums[b][c]+" ");
							
						}
				else {
					for(int b=0;b<=a;b++)
					for(int c=a;c>=0;c--)
						if(b+c==a)
							System.out.print(nums[c][b]+" ");
			}
				System.out.println();
		}
			
			for(int a=num;a<=num*2-1;a++)
			for(int d=0;d<num;d++)
					if(a-d==num) {
					if(a%2==1) {
						for(int b = d;b<=num-1;b++)
						for(int c = num-1;c>=d;c--)
								if(b+c==a)
									System.out.print(nums[b][c]+" ");}
					else if(a%2==0) {
						for(int b = d;b<=num-1;b++)
						for(int c = num-1;c>=d;c--)
								if(b+c==a)
									System.out.print(nums[c][b]+" ");
							
						}
				System.out.println();		
				}
			
			}
	/*int c = 1;
	for(int a=0;a<13;a++)
		if(a==0) {System.out.print(nums[0][0]);}
		if(a%2==1)
			for(int b=0;b<=a;b++) {
				System.out.print(nums[b][c]);
				int c=c+1*/
					
			
		}
		
}
		
	/*for(int index = 0; index<7; index++) {
		if (index%2 == 1) {
			for(int num1 = index; num1>0; num1--)
				for(int num2 = )
			System.out.println(nums);
		}
	}*/
	
		
	
			
	
		
	
	



