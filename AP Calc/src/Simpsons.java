// Java program for simpson's 1/3 rule 
import java.util.*;

public class Simpsons{ 
	
	// Function to calculate f(x) 
	static float func(float x, float r) 
	{ 
			return (float)(Math.sqrt(Math.pow(r, 2)-Math.pow(x, 2))); 
	} 

	// Function for approximate integral 
	static float simpsons_(float ll, float ul, int n, float r) 
	{ 
		if (ll > -1) {
			return 0;
		}
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
		Simpsons monLan = new Simpsons();
		ArrayList<Float> volumeLarge = new ArrayList<Float>();
		ArrayList<Float> volumeSmall = new ArrayList<Float>();
		// Lower limit 
		float lower_limit = (float) -76.2; 
		float lower_lim = (float)-73.2;
		float layerHeight = (float).2;
		
		// Upper limit 
		float upper_limit = (float)71.12; 
		
		// Number of interval 
		int n = 8; 
		float vl = 0;
		float vs = 0;
		float radius = (float) 76.2;
		float radiusSm = (float)73.2;
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	    System.out.printf("%15s %15s %15s %15s %2s %20s %15s %15s", "Volume of Slice", "Lower Limit", "Upper Limit", "Radius"," - ", "Volume of Small Slice", "Lower Limit", "Radius");
	    System.out.println();
	    System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < 369; i++) {
			vl += simpsons_(lower_limit, upper_limit, n, radius);
			volumeLarge.add(simpsons_(lower_limit, upper_limit, n, radius));
			//System.out.println(volumeLarge.get(i));
			System.out.format("%15s %15s %15s %15s %2s %20s %15s %15s", simpsons_(lower_limit, upper_limit, n, radius), lower_limit, upper_limit, radius, " - ",simpsons_(lower_lim, upper_limit, n, radiusSm), lower_lim, radiusSm );
			System.out.println();
			//System.out.println("Volume of Slice: " + simpsons_(lower_limit, upper_limit, n, radius) + " Lower Limit: " + lower_limit + " Upper Limit: " + upper_limit + " Radius: " + radius); 
			if(lower_lim < -1) {
				vs += simpsons_(lower_lim, upper_limit, n, radiusSm);
			}
			//System.out.println("Volume of Small Slice: " + simpsons_(lower_lim, upper_limit, n, radiusSm) + " Lower Limit: " + lower_lim + " Upper Limit: " + upper_limit + " Radius: " + radiusSm);
			lower_lim += layerHeight;
			lower_limit += layerHeight; 
			upper_limit -= layerHeight;
			radius -= layerHeight;
			radiusSm -= layerHeight;
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Large Volume: " + (vl));
		System.out.println("Small Volume: " + vs);
		System.out.println("Subtracted Volume: " + (vl-vs));
		System.out.println("Total Volume: " + (vl-vs)*2);
		
	  
		
	} 

} 
