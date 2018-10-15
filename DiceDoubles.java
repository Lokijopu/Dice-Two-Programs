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
		int a = die1.roll();
		int b = die2.roll();
		while (a != b) {
			count++;
			System.out.println(a + " " + b);
			a = die1.roll();
			b = die2.roll();
		}
		if (a == b) {
			System.out.println(a + "=" + b);
			count++;
		}
		System.out.println("Num rolls: " + count);
	}

}
