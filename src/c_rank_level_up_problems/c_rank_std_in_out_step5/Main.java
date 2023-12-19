package c_rank_level_up_problems.c_rank_std_in_out_step5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		String out = "";
		for (int i = 0; i < count; i++) {
			out += "paiza";

			if (i < count - 1) {
				out += " ";
			}
		}

		System.out.println(out);
	}
}
