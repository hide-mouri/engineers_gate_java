package engineers_gate_java.lesson2.step4;

public class Main {

	public static void main(String[] args) {
		int i = 10;
		int j = 2;

		Addition addition = new Addition(i, j);
		int ans = addition.getAnswer();
		System.out.println(i + " + " + j + " = " + ans);

		Subtraction subtraction = new Subtraction(i, j);
		ans = subtraction.getAnswer();
		System.out.println(i + " - " + j + " = " + ans);

		Multiplication multiplication = new Multiplication(i, j);
		ans = multiplication.getAnswer();
		System.out.println(i + " * " + j + " = " + ans);

		Division division = new Division(i, j);
		ans = division.getAnswer();
		System.out.println(i + " / " + j + " = " + ans);
	}
}
