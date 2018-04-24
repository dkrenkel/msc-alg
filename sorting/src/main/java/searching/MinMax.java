/**
 * 
 */
package searching;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class MinMax {
	
	public static void main(String[] args) {
		int[] array = minMax(new int[] {3, 5, 1, 10});
		System.out.println("Maior: " + array[0]);
		System.out.println("Menor: " + array[1]);
	}

	public static int[] minMax(int[] array) {
		return minMax(array, 0, array.length-1);
	}
	
	private static int[] minMax(int[] array, int start, int end) {
		if (end - start == 0) {
			return new int[] {array[start], array[end]};
		}
		if ((end - start) == 1) {
			if (array[start] > array[end]) {
				return new int[] {array[start], array[end]};
			} else {
				return new int[] {array[end], array[start]};
			}
		}
		int middle = (start+end)/2;
		int[] result1 = minMax(array, start, middle);
		int[] result2 = minMax(array, middle+1, end);
		int min, max = 0;
		if (result1[0] > result2[0]) {
			max = result1[0];
		} else {
			max = result2[0];
		}
		if (result1[1] < result2[1]) {
			min = result1[1];
		} else {
			min = result2[1];
		}
		return new int[] {max, min};
	}
}
