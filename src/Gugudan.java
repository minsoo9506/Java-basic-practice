import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("구구단 몇단?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(number + "*" + i + "= " + number * i);
		}
	}
}
