package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSearcher {
	public long containsCount(String[] strArr, String strToCount) {
		return Arrays.stream(strArr).filter((x) -> x == strToCount).count();
	}
}
