
public class array {

	public static void main(String[] args) {
		int size = 10;
		int temp;
		int [][]array = new int [size][size];
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int) Math.round(Math.random()*100+100);
				System.out.print(" "+ array[i][j]);
			}
			System.out.println();
		} // Массив заполнен рандомными значениями.
		// Сортировка 
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				for(int k = 0; k < array.length; k++) {
					for(int l = 0; l < array.length ; l++) {
						if(array[i][j] > array[k][l]) {
						temp = array[i][j];
						array[i][j] = array[k][l];
						array[k][l] = temp;
				}
			}
		}
	}
}

		System.out.println();
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
					System.out.print(" "+ array[i][j]);
			}
			System.out.println();
		}
	}
}