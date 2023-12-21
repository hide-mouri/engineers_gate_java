package engineers_gate_java.lesson4.step1;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog();
		System.out.println(dog.sound());

		Animal cat = new Cat();
		System.out.println(cat.sound());

		Animal lion = new Lion();
		System.out.println(lion.sound());
	}
}
