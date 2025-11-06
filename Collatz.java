// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]); //num max seed
		String m = args[1];	
		

		if (m.equals("v")) {
			System.out.println("1 4 2 1 (4)");
			for (int t = 2; t <= N; t++) {
				System.out.print(t + " ");	
				int x = t;
				int i = 0;
						
				while (x != 1) {			
					if (x % 2 == 0) {				
						x = x / 2;
						System.out.print(x + " ");
						i = i + 1;
					} else {				
						x = ((x) * 3) + 1;
						System.out.print(x + " ");
						i = i + 1;				
					}
								
				}
				System.out.print("(" + i + ")");
				System.out.println();
		
		}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		} else {
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}		
	}
}

