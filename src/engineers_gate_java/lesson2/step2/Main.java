package engineers_gate_java.lesson2.step2;

public class Main {

	public static void main(String[] args) {
		int i = 10;
		int j = 2;

		int ans = add(i, j);
		System.out.println(i + " + " + j + " = " + ans);

		ans = sub(i, j);
		System.out.println(i + " - " + j + " = " + ans);

		ans = mlt(i, j);
		System.out.println(i + " * " + j + " = " + ans);

		ans = div(i, j);
		System.out.println(i + " / " + j + " = " + ans);
	}

	/**
	 * 足し算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数
	 * @return i + j の結果を返します。
	 */
	public static int add(int i, int j) {
		return i + j;
	}

	/**
	 * 引き算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数
	 * @return i - j の結果を返します。
	 */
	public static int sub(int i, int j) {
		return i - j;
	}

	/**
	 * 掛け算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数
	 * @return i * j の結果を返します。
	 */
	public static int mlt(int i, int j) {
		return i * j;
	}

	/**
	 * 割り算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数（※ゼロは指定できません。）
	 * @return i / j の結果を返します。
	 */
	public static int div(int i, int j) {
		if (j == 0) {
			throw new IllegalArgumentException("ゼロで割ることはできません。");
		}
		return i / j;
	}
}
