
public class Array2dBuilder {
	private int[][] arrayOfData;
	private int row;
	private int col;
	public Array2dBuilder(int rows, int cols) {
		arrayOfData = new int[rows][cols];
		row = rows;
		col = cols;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				int result = (int)(Math.random()*100);
				arrayOfData[i][j] = result;
			}
		}
		
	}
	
	public int[][] getArrayOfData() {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if (arrayOfData[i][j] % 2 == 0) {
					System.out.println("Location [" + i + "]" + "[" + j + "] = " + arrayOfData[i][j]);
				} else {
					System.out.println("Location [" + i + "]" + "[" + j + "] = " + arrayOfData[i][j] + " not divisible by 2");
				}
			}
		}
		return arrayOfData;
	}
}
