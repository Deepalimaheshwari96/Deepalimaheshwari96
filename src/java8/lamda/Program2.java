package java8.lamda;


@FunctionalInterface
interface FindString {
	void find(String str);
}

public class Program2 {

	public static void main(String[] args) {

		String str1 = "Taj mahal is situated in Agra";
		String str2 = "Tasj mahal is situsated in Agrast";

		FindString fs = (s) -> {
			if (s.contains("ast") || s.contains("sta") || s.contains("tas") || s.contains("tsa")) {
				System.out.println("String found");
			} else {
				System.out.println("String not found");
			}
		};
		fs.find(str1);

	}

}
