/**
 * 
 * @author Kevin Guo Period 6 DiceDoubles
 *
 */
public class DiceDoubles {

	public static void main(String[] args) {
		int count = 0;
		DiceClass die1 = new DiceClass();
		DiceClass die2 = new DiceClass();
		while (die1.roll() != die2.roll()) {
			if (true) {
			count++;
			System.out.println(die1.roll() + "  " + die2.roll());
			die1.roll();
			die2.roll();
			}
		}
		
		System.out.println("Num rolls: " + count);
	}

}
