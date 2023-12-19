package c_rank_level_up_problems.c_rank_for.step1;

import java.util.Scanner;

/**
 * STEP: 1 3の倍数のカウント
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();

		int count = 0;
		for (int i = 0; i < target; i++) {

			int j = sc.nextInt();

			if (j % 3 == 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}
