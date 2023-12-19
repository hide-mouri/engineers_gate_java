package c_rank_level_up_problems.c_rank_for.step2;

import java.util.Scanner;

/**
 * STEP: 2 フラグ管理
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		String ans = "NO";
		for (int i = 0; i < count; i++) {
			int j = sc.nextInt();

			if (j == 7) {
				ans = "YES";
				break;
			}
		}

		System.out.println(ans);
	}
}
