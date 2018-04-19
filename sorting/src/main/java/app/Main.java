package app;

import sorting.InsertionSortIterative;
import sorting.Sortable;

public class Main {

	public static void main(String[] args) {
		Sortable sorter = new InsertionSortIterative();
		int[] array = sorter.sort(new int[] {3, 5, 1, 10});
		for (int i : array) {
			System.out.println(i);
		}
	}

}
