package engineers_gate_java.lesson3.step1;

public class Main {

	public static void main(String[] args) {

		// 長方形
		Shape rectangle = new Rectangle(3, 5);
		System.out.println("長方形の面積=" + rectangle.area() + ", 周囲長=" + rectangle.perimeter());

		// 円
		Shape circle = new Circle(5);
		System.out.println("円の面積=" + circle.area() + ", 周囲長=" + circle.perimeter());

		// 正三角形
		Shape triangle = new Triangle(5);
		System.out.println("正三角形の面積=" + triangle.area() + ", 周囲長=" + triangle.perimeter());
	}
}
