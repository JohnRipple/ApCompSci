import java.math.*;
import java.text.DecimalFormat;

public class SliceVolume {
	private static int layers = 381; //490
	private static double layerHeight = .2;
	
	public static void main(String args[]) {
		DecimalFormat df = new DecimalFormat("####0.00");
		double radius = 76.2;
		double radiusSm = 73.2;
		double volume = 0;
		double volumeSm = 0;
		for(int i = 0; i < layers; i++) {
			volume += Math.PI*radius*radius*layerHeight;
			volumeSm += Math.PI*radiusSm*radiusSm*layerHeight;
			radius = Double.parseDouble(df.format(radius-layerHeight));
			radiusSm = Double.parseDouble(df.format(radiusSm-layerHeight));
			System.out.println("Large: " + volume);
			System.out.println("Small: " + volumeSm);
		}
		volume -= volumeSm;
		System.out.println(volume);
	}
	
}
