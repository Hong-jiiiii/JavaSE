package practice2;

import java.util.Scanner;

public class practiceAnswer {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num;

		System.out.println("양의 정수를 입력해주세요.");
		num = scanner.nextInt();

		int[][] nums = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				nums[i][j] = (j + 1) + (i * num);

			}

		}

		for (int f = 0; f < nums.length; f++) {
			for (int k = 0; k < nums[f].length; k++) {
				System.out.print(nums[f][k] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < 2 * num - 1; i++)
			if (i < num) {
				for (int j = 0; j < i + 1; j++) {
					if (i % 2 == 0) {
						System.out.print(nums[i - j][j] + " ");
					} else {
						System.out.print(nums[j][i - j] + " ");
					}
				}
				System.out.println();
			} else {
				for(int j = 0; j< 2*num-1-i; j++)
				//for (int j = num - 1; j > 0; j--) 
				{

					if (i % 2 == 1) {
						//if (i - j > num - 1)
							//continue;
						System.out.print(nums[(num-1)-j][i-(num-1)+j] + " ");
					} else {
						//if (i - j > num - 1)
							//continue;
						System.out.print(nums[i-(num-1)+j][(num-1)-j] + " ");
						//System.out.print(nums[j][i - j] + " ");
					}

				}
				System.out.println();
			}

	}
}