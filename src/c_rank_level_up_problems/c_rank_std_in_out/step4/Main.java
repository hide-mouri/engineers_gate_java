package c_rank_level_up_problems.c_rank_std_in_out.step4;

import java.util.Scanner;

/**
 * STEP: 4 入力の配列による保持
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int out = 0;
		for (int i = 0; i < count; i++) {
			int j = sc.nextInt();
			if (out < j) {
				out = j;
			}
		}

		System.out.println(out);
	}
}
