import java.util.Scanner;

public class Gugudan {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("������ ���?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number < 2) {
			System.out.println("2�̻��� �Է��ϼ���.");
		} else if (number > 9) {
			System.out.println("9���ϸ� �Է��ϼ���.");
		} else {
			GugudanAnother classG = new GugudanAnother();
			classG.print(number);
		}

	}
}
