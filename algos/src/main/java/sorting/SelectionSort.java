package sorting;

import java.util.List;

/**
 * Created by Nikhil on 10/2/2016.
 * Finding smallest number on the right and swap with current.
 */
public class SelectionSort {

	public <T extends Comparable> List<T> sort(List<T> input) {
		if (input == null || input.size() <= 1) {
			return input;
		}
		for (int i = 0; i < input.size(); i++) {
			int minIndex = getSmallestIndex(input, i, input.size() - 1);
			swap(input, minIndex, i);
		}
		return input;
	}

	private <T extends Comparable> void swap(List<T> input, int j, int i) {
		T temp = input.get(i);
		input.set(i, input.get(j));
		input.set(j, temp);
	}

	private <T extends Comparable> int getSmallestIndex(List<T> input, int start, int end) {
		int index = start;
		T object = null;
		for (int i = start; i <= end; i++) {
			T temp = input.get(i);
			if (object == null || object.compareTo(temp) >= 0) {
				object = temp;
				index = i;
			}
		}
		return index;
	}
}
