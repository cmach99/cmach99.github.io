import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		// Most common to use and it's unordered.
		// HashMap<String, Integer> hMap = new HashMap<String, Integer>();

		// LinkedHasMap this is an ordered list as you entered the info
		HashMap<String, Integer> hMap = new LinkedHashMap<String, Integer>();

		// hMap.put(String key, Integer value)

		hMap.put("one", 1);
		hMap.put("five", 5);
		hMap.put("ten", 10);
		hMap.put("fifteen", 15);
		hMap.put("twenty", 20);
		hMap.put("twenty five", 25);
		hMap.put("thirty", 30);

		// size of Map
		System.out.println(hMap.values());
		System.out.println(hMap.keySet());
		
		System.out.println(hMap.size());
		

		System.out.println("Value of third element is " + hMap.get("ten"));

		// iteration of Map

		for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
			String ke = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(ke + ", " + val);

		}

		// iteration1 using a keyset

		for (String element : hMap.keySet()) {
			Integer val = hMap.get(element);
			System.out.print(element + "," + val + " ");

		}
		System.out.println();

		// iteration2 using a valueset

		for (Integer val : hMap.values()) {

			System.out.print(val + " ");
		}

	}

}
