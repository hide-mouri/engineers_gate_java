package c_rank_level_up_problems.c_rank_string_step6;

import java.util.Scanner;

/**
 * STEP: 6 数字の文字列操作（時刻2）
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split(":");

		int hour = Integer.parseInt(arr[0]);
		int minutes = Integer.parseInt(arr[1]) + 30;

		if (minutes / 60 >= 1) {
			hour = hour + 1;
			minutes = minutes % 60;
		}

		if (hour / 24 >= 1) {
			hour = hour % 24;
		}

		System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", minutes));
	}
}
