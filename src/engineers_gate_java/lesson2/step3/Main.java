package engineers_gate_java.lesson2.step3;

public class Main {

	public static void main(String[] args) {
		int i = 10;
		int j = 2;

		int ans = Addition.getAnswer(i, j);
		System.out.println(i + " + " + j + " = " + ans);

		ans = Subtraction.getAnswer(i, j);
		System.out.println(i + " - " + j + " = " + ans);

		ans = Multiplication.getAnswer(i, j);
		System.out.println(i + " * " + j + " = " + ans);

		ans = Division.getAnswer(i, j);
		System.out.println(i + " / " + j + " = " + ans);
	}
}
