package Spint5;

public class Manual8 {

	public static void main(String[] args) {
		System.out.println("Firts roll="+diceRoll());
		System.out.println("Second roll="+diceRoll());
		System.out.println("Third roll="+diceRoll());

	}
	 public static int diceRoll() {
		 int dice=1+(int) (Math.random()*6);
		 return dice;
		 

}}
      
    	  
      