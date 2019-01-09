// Java program for simpson's 1/3 rule 

public class Simpsons{ 
	private static boolean function = false;

	// Function to calculate f(x) 
	static float func(float x) 
	{ 
		if (function == false) {
			return (float)(Math.sqrt(9-Math.pow(x, 2))); 
		}
		return (float)(Math.sqrt(7.84-Math.pow(x, 2))); 
	} 

	// Function for approximate integral 
	static float simpsons_(float ll, float ul, 
									int n) 
	{ 
		// Calculating the value of h 
		float h = (ul - ll) / n; 

		// Array for storing value of x 
		// and f(x) 
		float[] x = new float[10]; 
		float[] fx= new float[10]; 

		// Calculating values of x and f(x) 
		for (int i = 0; i <= n; i++) { 
			x[i] = ll + i * h; 
			fx[i] = func(x[i]); 
		} 

		// Calculating result 
		float res = 0; 
		for (int i = 0; i <= n; i++) { 
			if (i == 0 || i == n) 
				res += fx[i]; 
			else if (i % 2 != 0) 
				res += 4 * fx[i]; 
			else
				res += 2 * fx[i]; 
		} 
		
		res = res * (h / 3); 
		return res; 
	} 

	// Driver Code 
	public static void main(String s[]) 
	{ 
		// Lower limit 
		float lower_limit = -3; 
		
		// Upper limit 
		float upper_limit = (float)2.8; 
		
		// Number of interval 
		int n = 8; 
		int vl = 0;
		int vs = 0;
		for(int i = 0; i < 390; i++) {
			vl += simpsons_(lower_limit, upper_limit, n);
			//System.out.println(simpsons_(lower_limit, upper_limit, n)); 
			function = true;
			lower_limit = (float)-2.8;
			System.out.println(simpsons_(lower_limit, upper_limit, n)); 
			lower_limit = -3; 
			function = false;
		}
			
	} 
} 

// This code is contributed by Gitanjali 
