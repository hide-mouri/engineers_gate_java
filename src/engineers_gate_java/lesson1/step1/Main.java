package engineers_gate_java.lesson1.step1;

public class Main {

	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "bbb";

		String tmp = str1;
		str1 = str2;
		str2 = tmp;

		System.out.println("str1=" + str1 + ", str2=" + str2);
	}
}
