// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int num = 1, counter = 0; // Num will be our main calculating source, while counter will count the steps proper.
		for (int i = 1; i <= seed; i++) {
			do {
				// Will only display if the mode has been set to 'v'
				if (mode.equals("v")) {
					System.out.print(num+" ");
				}
				// Actual Calculations
				if (num % 2 == 0)
					num /= 2;
				else
				num = num * 3 + 1;
				counter++;
				
			} while (num != 1);
			// Will only display if the mode has been set to 'v'
			if (mode.equals("v")) {
				System.out.print(num+" "+"("+(counter+1)+")");
				System.out.println("");
			}

			counter = 0;
			num = i+1;
		}
		// Checks if the mode has been set to either 'v' or 'c'
		if (mode.equals("v") || mode.equals("c"))
		System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
		else // I've added this to not make the first if the most pointless if of all time.
		System.out.println("Unrecognized mode. Please choose mode 'v' or 'c'");
	}
}
