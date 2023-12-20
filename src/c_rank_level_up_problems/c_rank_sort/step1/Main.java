package c_rank_level_up_problems.c_rank_sort.step1;

import java.util.Scanner;

/**
 * STEP: 1 昇順ソート
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n;) {
			int a = arr[i];
			int b = 0;

			if ((i + 1) < n) {
				b = arr[i + 1];
			} else {
				n--;
				i = 0;
				continue;
			}

			if (a > b) {
				arr[i] = b;
				arr[i + 1] = a;
			}
			i++;
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
