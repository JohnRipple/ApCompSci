import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		while(1==1) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("N=");
		int input = keyboard.nextInt();
		for (int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				System.out.print("# ");
			}
			System.out.println("");
		}
		}
	}
}
