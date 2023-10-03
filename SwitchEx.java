import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("choose a day:");

		int day = scan.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("its time for weekend");
		}
		System.out.println("end of switch stmt");
	}
}
