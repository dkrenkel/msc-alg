/**
 * 
 */
package sorting;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class InsertionSortIterative implements Sortable {

	@Override
	public int[] sort(int[] array) {
		insertionSort(array, array.length);
		return array;
	}

	private void insertionSort(int[] array, int n) {
		for (int i = 1; i < n; i++) {
			int j = i;
			int value = array[i];
			while (j > 0 && array[j - 1] > value) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = value;
		}
	}

}
