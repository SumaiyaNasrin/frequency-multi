package array_test.io.naztech;

public class frequency {
	
	
	static int arr2 []= {1,2,2,2,3,3,4,5,6};
	public static int max() {

		int[] freq = new int[10000];
		for (int i = 0; i < freq.length; i++) {
			freq[i] = 0;
		}
		for (int i = 0; i < arr2.length; i++) {
			int p;
			if (freq[arr2[i]] <= 0) {
				p = arr2[i];
				for (int j = 0; j < arr2.length; j++) {

					if (arr2[j] == p) {

						freq[p] = freq[p] + 1;
					}
				}

			}

		}
		int max = Integer.MIN_VALUE;

		for (int j = 0; j < arr2.length; j++) {
			if (freq[j] > max)
				max = freq[j];
		}
		return max;

	}

	public static int min() {

		int[] freq = new int[10000];
		for (int i = 0; i < freq.length; i++) {
			freq[i] = 0;
		}
		for (int i = 0; i < arr2.length; i++) {
			int p;
			if (freq[arr2[i]] <= 0) {
				p = arr2[i];
				for (int j = 0; j < arr2.length; j++) {

					if (arr2[j] == p) {

						freq[p] = freq[p] + 1;
					}
				}

			}

		}
		int min = Integer.MAX_VALUE;

		for (int j = 0; j < arr2.length - 1; j++) {

			if (freq[arr2[j]] < min) {

				min = freq[arr2[j]];

			}

		}
		return min;

	}
}

