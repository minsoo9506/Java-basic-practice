import java.util.Scanner;

public class Gugudan {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("구구단 몇단?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number < 2) {
			System.out.println("2이상을 입력하세요.");
		} else if (number > 9) {
			System.out.println("9이하를 입력하세요.");
		} else {
			GugudanAnother classG = new GugudanAnother();
			classG.print(number);
		}

	}
}
