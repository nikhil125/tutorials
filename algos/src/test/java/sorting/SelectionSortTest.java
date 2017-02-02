package sorting;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Nikhil on 10/2/2016.
 */
public class SelectionSortTest {
	private SelectionSort testObj;

	@Before
	public void setup() {
		this.testObj = new SelectionSort();
	}

	@Test
	public void testSort() {
		List<Integer> input = Lists.newArrayList(2, 5, 4, 3);
		List<Integer> result = testObj.sort(input);
		Assert.assertEquals(Lists.newArrayList(2, 3, 4, 5), result);
	}
}