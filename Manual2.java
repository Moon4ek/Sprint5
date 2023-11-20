package Spint5;

public class Manual2 {

	public static void main(String[] args) {
		drawLine3(5,"+","|","o");
		System.out.println();
		drawLine3(9,"+","|","o");
		System.out.println();
		drawLine3(11,"+","|","o");
		System.out.println();
		drawLine3(8,"+","|","o");
		System.out.println();
		drawLine3(3,"+","|","o");

	}
	public static void drawLine3(int lineWidth,String sym,String startSym, String endsym ) {
		System.out.print(startSym);
		for(int i=2;i<=lineWidth-1;i++) {
			System.out.print(sym);
		}
		System.out.print(endsym);
	}

}
