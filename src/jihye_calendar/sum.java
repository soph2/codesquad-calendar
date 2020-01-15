package jihye_calendar;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner scanstring = new Scanner(System.in);
		String inputValue = scanstring.nextLine();
		String[] splitValue = inputValue.split(",");
		int x = Integer.parseInt(splitValue[0]);
		int y = Integer.parseInt(splitValue[1]);
		System.out.println(x+" + "+y+" = "+ (x+y));
		System.out.printf("%d + %d = %d", x,y,x+y);
		
		scanstring.close();
	}
}
 //automatically input 'import' -> ctrl + shift + M