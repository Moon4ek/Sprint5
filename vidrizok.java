package Spint5;

public class vidrizok {
	public static void main(String[] args) {       
        int x1 = 3;
        int y1 = 51;
        int x2 = 62;
        int y2 = 11;
        double result = distance(x1, y1, x2, y2);
        System.out.println("Довжина відрізка: " + result);
    }

    public static int distance(int x1, int y1, int x2, int y2) {        
        return (int)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
