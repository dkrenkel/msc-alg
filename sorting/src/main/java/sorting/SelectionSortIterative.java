package sorting;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class SelectionSortIterative implements Sortable {

	@Override
	public int[] sort(int[] array) {
		selectionSort(array, array.length);
		return array;
	}

	private void selectionSort(int[] array, int n) {
		for (int i = 0; i < n-1; i++) {
			int min = i;
			for (int j = i+1; j<n; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int aux = array[min];
			array[min] = array[i];
			array[i] = aux;
		}
	}

}
