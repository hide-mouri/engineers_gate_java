package c_rank_level_up_problems.c_rank_string.step4;

import java.util.Scanner;

/**
 * STEP: 4 数字の文字列操作（0埋め）
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();

		String out = str;
		for (int i = 3; i > length; i--) {
			out = "0" + out;
		}

		System.out.println(out);
	}
}
