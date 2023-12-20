package engineers_gate_java.lesson2.step5;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(2, 0);
		Point p2 = new Point(1, 3);

		double ans1 = getDistance(p1, p2);
		System.out.println(ans1);
	}

	/**
	 * 2点間の距離を返します。
	 *
	 * @param p1 座標1
	 * @param p2 座標2
	 * @return 2点間の距離を返します。
	 */
	public static double getDistance(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
}
