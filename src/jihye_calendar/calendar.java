package jihye_calendar;

import java.util.Scanner;

public class calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public int getMaxDaysOfMonth(int month) {
		switch (month) {
		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		default:
			return 31;
		}
	}

	public static void main(String[] args) {

		System.out.println(" S  M  T  W  T  F  S");
		System.out.println("----------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30");

		Scanner scan = new Scanner(System.in);
		Scanner scancnt = new Scanner(System.in);
		System.out.println("How many do you want to know the max day of month?");
		int cnt = scancnt.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println("Input the month");
			int month = scan.nextInt();
			calendar cal = new calendar();
			System.out.printf("%d월의 최대 일수는 %d일\n", month, cal.maxDaysOfMonth(month));
		}
		System.out.println("End");
		scan.close();
		scancnt.close();

	}

}
//arrange : Ctrl + Shift + F
