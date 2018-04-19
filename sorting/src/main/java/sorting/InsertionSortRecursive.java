/**
 * 
 */
package sorting;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class InsertionSortRecursive implements Sortable {

	@Override
	public int[] sort(int[] array) {
		insertionSort(array, array.length);
		return array;
	}

	private void insertionSort(int[] array, int n) {
		if (n > 1) {
			insertionSort(array, n - 1);
			int j = n - 1;
			int value = array[j];
			while (j > 0 && array[j - 1] > value) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = value;
		}

	}

}
