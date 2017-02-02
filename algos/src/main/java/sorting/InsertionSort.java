package sorting;

import java.util.List;

/**
 * Created by Nikhil on 10/2/2016.
 * Exchange on the left side.
 */
public class InsertionSort {

	public <T extends Comparable> List<T> sort(List<T> input) {
		if (input == null || input.size() <= 1) {
			return input;
		}
		for (int i = 1; i < input.size(); i++) {

			for (int j = i; j > 0; j--) {
				if (input.get(j - 1).compareTo(input.get(j)) > 0) {
					T temp = input.get(j - 1);
					input.set(j - 1, input.get(j));
					input.set(j, temp);
				}
			}
		}
		return input;
	}
}
