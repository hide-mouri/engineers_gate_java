package c_rank_level_up_problems.c_rank_std_in_out_boss;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			String name = sc.next();
			int age = sc.nextInt() + 1;
			System.out.println(name + " " + age);
		}
	}
}
