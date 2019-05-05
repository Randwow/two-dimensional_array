import javax.swing.JOptionPane;
public class array {

	public static void main(String[] args) {
		String length = JOptionPane.showInputDialog("Кол-во строк: "); 
		String weight = JOptionPane.showInputDialog("Кол-во столбцов : "); 
		int le,w;
		le = Integer.parseInt(length);
		w = Integer.parseInt(weight);
		int temp;
		int [][]array = new int [le][w];
		System.out.println();
		System.out.println("    Ваш заполненный массив");
		System.out.println();
		for(int i = 0; i < le; i++) {
			for (int j = 0; j < w; j++) {
				array[i][j] = (int) Math.round(Math.random()*100+100);
				System.out.print(" "+ array[i][j]);
			}
			System.out.println();
		} // Массив заполнен рандомными значениями.
		// Сортировка массива полностью с любым кол-вом строк и слобцов 
		System.out.println();
		System.out.println("    Ваш отсортерованный массив");
		for(int i = 0; i < le; i++) {
			for(int j = 0; j < w; j++) {
				for(int k = 0; k < le; k++) {
					for(int l = 0; l < w; l++) 
						if(array[i][j] > array[k][l]) {
						temp = array[i][j];
						array[i][j] = array[k][l];
						array[k][l] = temp;
				
					}
				}
			}
		}
// 		Сортировка по строкам 
//		for(int i = 0; i < le; i++) {
//			for(int j = 0; j < w; j++) {
//				for(int k = 0; k < w; k++) {
//						if(array[i][j] > array[i][k]) {
//						temp = array[i][j];
//						array[i][j] = array[i][k];
//						array[i][k] = temp;
//			}
//		}
//	 }
//}		Сортировка по слобцам 
//		for(int i = 0; i < le; i++) {
//			for(int j = 0; j < w; j++) {
//				for(int k = 0; k < le; k++) {
//						if(array[i][j] > array[k][j]) {
//						temp = array[i][j];
//						array[i][j] = array[k][j];
//						array[k][j] = temp;
//			}
//		}
//	 }
//}		
		System.out.println();
		for(int i = 0; i < le; i++) {
			for (int j = 0; j < w; j++) {
					System.out.print(" "+ array[i][j]);
			}
			System.out.println();
		}
	}
}