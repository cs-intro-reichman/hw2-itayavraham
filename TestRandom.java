// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
		int n = Integer.parseInt(args[0]);
		int counterAboveHalf = 0, counterBelowHalf = 0;
		// Establishing how many random numbers are generated above, below and equal to while counting them :
		for (int i = 0; i < n; i++) {
			if (Math.random() > 0.5)
			counterAboveHalf++;
			else
			counterBelowHalf++;
		}
		// Printing results and calculating the ratio (while making sure we cover the case of denominator being 0)
		double ratio;
		System.out.println("> 0.5: " + counterAboveHalf + " times");
		System.out.println("<= 0.5: " + counterBelowHalf + " times");
		if (counterAboveHalf != 0 && counterBelowHalf != 0) {
			ratio = (double)counterAboveHalf / counterBelowHalf;
			System.out.println("ratio: " + ratio);		
		}

	}
}
