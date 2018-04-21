/**
 * 
 */
package sorting;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class BubbleSortIterative implements Sortable {

	@Override
	public int[] sort(int[] array) {
		bubbleSort(array, array.length);
		return array;
	}

	private void bubbleSort(int[] array, int n) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (array[j] < array[j - 1]) {
					int aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
			}
		}
	}

}
