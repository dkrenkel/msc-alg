/**
 * 
 */
package sorting;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class BubbleSortRecursive implements Sortable {

	@Override
	public int[] sort(int[] array) {
		bubbleSort(array, array.length);
		return array;
	}

	private void bubbleSort(int[] array, int n) {
		if (n > 1) {
			for (int j = 1; j < n; j++) {
				if (array[j] < array[j-1]) {
					int aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;
				}
			}
			bubbleSort(array, n-1);
		}
	}
	
}
