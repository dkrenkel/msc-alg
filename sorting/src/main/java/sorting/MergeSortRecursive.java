/**
 * 
 */
package sorting;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class MergeSortRecursive implements Sortable {

	@Override
	public int[] sort(int[] array) {
		mergeSort(array, 0, array.length-1);
		return array;
	}

	private void mergeSort(int[] array, int start, int end) {
		if (start < end) {
			final int middle = (start+end)/2;
			
			mergeSort(array, start, middle);
			mergeSort(array, middle+1, end);
			
			merge(array, start, middle, end);
		}
		
		
	}

	private void merge(int[] array, int start, int middle, int end) {
		final int seq1Size = middle - start + 1;
		final int seq2Size = end - middle;
		int[] seq1 = new int[seq1Size];
		int[] seq2 = new int[seq2Size];
		
		for (int i = 0; i < seq1.length; i++) {
			seq1[i] = array[start+i];
		}
		
		for (int j = 0; j < seq2.length; j++) {
			seq2[j] = array[middle+j+1];
		}
		
		int indexA = start;
		int index1 = 0, index2 = 0;
		while (index1 < seq1.length && index2 < seq2.length) {
			if (seq1[index1] < seq2[index2]) {
				array[indexA] = seq1[index1];
				index1++;
			} else {
				array[indexA] = seq2[index2];
				index2++;
			}
			indexA++;
		}
		
		while (index1 < seq1.length) {
			array[indexA] = seq1[index1];
			index1++;
			indexA++;
		}
		
		while (index2 < seq2.length) {
			array[indexA] = seq2[index2];
			index2++;
			indexA++;
		}
	}

}
