package Spint5;

public class daytizna {

	public static void main(String[] args) { 
        int dayOfWeekResult = dayOfWeek(12, 29, 2023);
        System.out.println("День тижня: " + dayOfWeekResult);
    }
	
	public static int dayOfWeek(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;
	}
}


