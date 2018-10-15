/**
 * 
 * @author Kevin Guo Period 6 DiceTarget
 *
 */
import java.util.Scanner;
public class DiceTarget {

	public static void main (String args[]) {
		int count = 0;
		Scanner in = new Scanner(System.in);
		DiceClass die1 = new DiceClass();
		DiceClass die2 = new DiceClass();
		int a = die1.roll();
		int b = die2.roll();
		int sum = a+b;
		System.out.print("Input a target value between 2 and 12: ");
		int target = in.nextInt();
		while (target < 2 || target > 12) {
			System.out.println("Error: Invalid input.");
			System.out.print("Input a target value between 2 and 12: ");
			target = in.nextInt();
		} 
			while (sum != target) {
				count++;
				System.out.println(a + " + " + b + " = " + sum + ". Num rolls: " + count);
				a = die1.roll();
				b = die2.roll();
				sum = a + b;
			} 
			if (sum == target) {
				count++;
				System.out.println(a + " + " + b + " = " + sum + ". Num rolls: " + count);
				System.out.println("Target has been reached.");
			}
		
		System.out.println(count);
	}
}
