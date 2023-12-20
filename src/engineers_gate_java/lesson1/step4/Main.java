package engineers_gate_java.lesson1.step4;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
		}

		for (int i : arr) {
			if ((i % 2) == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
