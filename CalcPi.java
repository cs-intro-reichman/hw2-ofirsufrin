// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]); // input
		double sum = 1.0; //the start that give in the matala
		int i = 1; // nuber for loop
		int y = 3;
			    
		while (i < num) {
			double x = 1.0 / (double) y;
			if (i % 2 == 0) {
				sum = sum + x;
			} else {
				sum = sum - x;
			}
			y = y + 2;
			i = i + 1;

		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
