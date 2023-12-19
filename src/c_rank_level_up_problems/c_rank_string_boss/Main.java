package c_rank_level_up_problems.c_rank_string_boss;

import java.util.Scanner;

/**
 * FINAL問題 文字列
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			String str = sc.next();
			String[] arr = str.split(":");
			int addHour = sc.nextInt();
			int addMinutes = sc.nextInt();

			int hour = Integer.parseInt(arr[0]) + addHour;
			int minutes = Integer.parseInt(arr[1]) + addMinutes;

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
}
