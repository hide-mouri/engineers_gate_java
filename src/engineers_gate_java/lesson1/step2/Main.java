package engineers_gate_java.lesson1.step2;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		int[] arr2 = new int[arr1.length];

		int length = arr1.length;
		int j = length - 1;
		for (int i = 0; i < length; i++) {
			arr2[i] = arr1[j];
			j--;
		}

		for (int ans : arr2) {
			System.out.println(ans);
		}
	}
}
