package jihye_calendar;

public class calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static int year = 2020;

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

	public void printCalendar(int month) {
		System.out.printf("     %4d년 %3d월\n", year, month);
		System.out.println(" S  M  T  W  T  F  S");
		System.out.println("---------------------");

		int maxDay = getMaxDaysOfMonth(month);
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%2d ", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
//arrange : Ctrl + Shift + F
