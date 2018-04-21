/**
 * 
 */
package sorting;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class SelectionSortRecursive implements Sortable {

	@Override
	public int[] sort(int[] array) {
		selectionSort(array, 0, array.length);
		return array;
	}

	private void selectionSort(int[] array, int start, int end) {
		if (start < end) {
			int min = start;
			for (int j = min + 1; j < end; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int aux = array[start];
			array[start] = array[min];
			array[min] = aux;
			selectionSort(array, start + 1, end);
		}
	}

}
