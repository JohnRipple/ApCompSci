// Java program for simpson's 1/3 rule 

public class Simpsons{ 

	// Function to calculate f(x) 
	static float func(float x, float r) 
	{ 
			return (float)(Math.sqrt(Math.pow(r, 2)-Math.pow(x, 2))); 
	} 

	// Function for approximate integral 
	static float simpsons_(float ll, float ul, int n, float r) 
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
			fx[i] = func(x[i], r); 
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
		float lower_limit = (float) -76.2; 
		float lower_lim = (float)-73.2;
		float layerHeight = (float).2;
		
		// Upper limit 
		float upper_limit = (float)73.2; 
		
		// Number of interval 
		int n = 8; 
		float vl = 0;
		float vs = 0;
		float radius = (float) 76.2;
		float radiusSm = (float)73.2;
		for(int i = 0; i < 374; i++) {
			vl += simpsons_(lower_limit, upper_limit, n, radius);
			System.out.println(simpsons_(lower_limit, upper_limit, n, radius)); 
			vs += simpsons_(lower_lim, upper_limit, n, radiusSm);
			//System.out.println(simpsons_(lower_limit, upper_limit, n));
			lower_lim += layerHeight;
			lower_limit += layerHeight; 
			upper_limit -= layerHeight;
			radius -= layerHeight;
			radiusSm -= layerHeight;
		}
		System.out.println(vl + " " + lower_limit);
		System.out.println(vs + " " + lower_lim);
		System.out.println((vl-vs)*4);
	} 
} 
