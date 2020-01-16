package jihye_calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "Input the month : ";

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		calendar cal = new calendar();

		System.out.print(PROMPT);
		int month = scan.nextInt();
		while (month != -1) {
			cal.printCalendar(month);
			System.out.printf("%d월의 최대 일수는 %d일\n", month, cal.maxDaysOfMonth(month));
			System.out.print(PROMPT);
			month = scan.nextInt();
		}

		System.out.println("End");
		scan.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
