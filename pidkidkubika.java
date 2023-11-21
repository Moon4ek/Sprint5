package Spint5;

public class pidkidkubika {

	public static void main(String[] args) {
		 for (int i = 1; i <= 25; i++) {
	            int result1 = sumOfTwoDice();
	            int result2 = sumOfTwoDice();
	            System.out.println("Кидок " + i + ": " + result1 + " " + result2);
	        }
	}
    public static int sumOfTwoDice() {
	return (int) (Math.random() * 6)+1;
	    }
}
	
