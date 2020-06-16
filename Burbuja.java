package extraordinaria.ed;

public class Burbuja {

	public static void bubbleSort(int[] x) {
		int n = x.length;
		boolean hacerMas = true;
		while (hacerMas) {
			n--;
			hacerMas = false; 
			for (int i = 0; i < n; i++) {
				if ( x[i] > x[i + 1] ) {
					
					int temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					hacerMas = true; 
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] v = { 7, -1, -2, 0, 5, 4 };

		bubbleSort(v);
		for (int i = 0; i < v.length; i++)
			System.out.print(" " + v[i]);
	}

}
