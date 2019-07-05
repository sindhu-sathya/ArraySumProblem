package solution.arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static int solution(int a[], int n, int k) {
		int c[] = new int[2001];
		int i, w;
		
		for (w=1; w <=k; w++) {
			for (i = 0; i < n; i++) {
				if (a[i] <= w) {
					c[w] = Math.max(c[w], c[w-a[i]] + a[i]);
				}
			}
		}
		
		return c[k];
	}
    public static void main(String[] args) {
       
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int nums[];
		try {
			int t = Integer.parseInt(b.readLine());
			
			while(t-- > 0) {
				String nk[] = b.readLine().split(" ");
				int n = Integer.parseInt(nk[0]);
				int k = Integer.parseInt(nk[1]);
				
				nums = new int[n];
				String numbers[] = b.readLine().split(" ");
				//System.out.println(n + ", " + k);
				for (int i = 0; i < n; i++) {
					nums[i] = Integer.parseInt(numbers[i]);
				}
				
				System.out.println(solution(nums, n, k));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				b.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
    }
}