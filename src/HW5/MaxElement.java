package HW5;

public class MaxElement {

	public static void main(String[] args) {
		int [][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		 double[][] doubleArray = {
				 {1.2, 3.5, 2.2},
				 {7.4, 2.1, 8.2}
		 };
		 Work03 w = new Work03();
		 System.out.println(w.maxElement(intArray));
		 System.out.println(w.maxElement(doubleArray));
		 
	}
	public static class Work03 {
		int maxElement(int x[][]) {
			int max = 0;
			for(int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[0].length; j++) {
					if(x[i][j] > max)
						max = x[i][j];
				}
			}
			return max;
		}
		double maxElement(double x[][]) {
			double max = 0;
			for(int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[0].length; j++) {
					if(x[i][j] > max)
						max = x[i][j];
				}
			}
			return max;
		}
	}

}
