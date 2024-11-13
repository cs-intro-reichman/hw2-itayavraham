// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int numOfRuns = Integer.parseInt(args[0]);
		double denominator = 1.0, piApprox = 0.0;
		for (int i = 0; i < numOfRuns; i++) {
			if (i % 2 == 0)
			piApprox += 1/denominator;
			else
			piApprox -= 1/denominator;
			denominator+=2;
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated: "+4*piApprox);
	}
}
