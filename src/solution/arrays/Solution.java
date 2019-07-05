package solution.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int result[];

	public static void main(String[] args) {
		int times;
		int n, k;
		Scanner sc = new Scanner(System.in);
		times = sc.nextInt();
		int res[] = new int[times];

		for (int i = 0; i < times; i++) {
			n = sc.nextInt();// n is number of array
			k = sc.nextInt();
			result = new int[k + 1];
			Arrays.fill(result, -1);
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			sc.close();
			res[i] = compute(arr, k);
		}

		for (int i = 0; i < times; i++) {
			System.out.println(res[i]);
		}
	}

	static int compute(int arr[], int k) {
		int flag = 0;
		if (k < 0)
			return 0;
		if (result[k] != -1)
			return result[k];
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (k >= arr[i]) {
				flag = 1;
				if (max < compute(arr, k - arr[i]) + arr[i])
					max = compute(arr, k - arr[i]) + arr[i];
			}

		}
		if (flag == 0)
			result[k] = 0;
		else
			result[k] = max;
		return result[k];
	}
}
