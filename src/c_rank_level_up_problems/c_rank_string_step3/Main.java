package c_rank_level_up_problems.c_rank_string_step3;

import java.util.Scanner;

/**
 * STEP: 3 数字の文字列操作（基本）
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		int i = Integer.parseInt(String.valueOf(arr[0])) + Integer.parseInt(String.valueOf(arr[3]));
		int j = Integer.parseInt(String.valueOf(arr[1])) + Integer.parseInt(String.valueOf(arr[2]));

		System.out.println(String.valueOf(i) + String.valueOf(j));
	}
}
