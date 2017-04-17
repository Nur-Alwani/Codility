import java.util.*;

	public static int solution(int[] arr) {

		Arrays.sort(arr); // ASCENDING DEFAULT

		for (int i = 1; i < arr.length - 1; i++) {
			if (((long) arr[i - 1] + (long) arr[i]) > (long) arr[i + 1])
				return 1;
		}

		return 0;

	}
}
