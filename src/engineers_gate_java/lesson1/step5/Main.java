package engineers_gate_java.lesson1.step5;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "りんご");
		map.put(2, "いちご");
		map.put(3, "みかん");
		map.put(4, "バナナ");
		map.put(5, "メロン");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
