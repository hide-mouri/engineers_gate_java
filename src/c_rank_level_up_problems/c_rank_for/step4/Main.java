package c_rank_level_up_problems.c_rank_for.step4;

import java.util.Scanner;

/**
 * STEP: 4 多重ループ
 */
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		String[] marr = new String[m];

		for (int i = 0; i < m; i++) {
			marr[i] = sc.next();
		}

		int n = sc.nextInt();
		String[] narr = new String[n];

		for (int i = 0; i < n; i++) {
			narr[i] = sc.next();
		}

		for (String mstr : marr) {
			for (String nstr : narr) {

				if (nstr.indexOf(mstr) >= 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
