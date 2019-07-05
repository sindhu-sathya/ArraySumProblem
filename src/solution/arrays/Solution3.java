package solution.arrays;

import java.util.Scanner;

	public class Solution3{ 
	    public static int solution (int [] N, int k, int n){
	        int MultiSum[][] = new int[n+1][k+1];
	        int i,j;
	        for (i=0;i<n+1;i++){
	            MultiSum[i][0] = 0;
	            
	        }
	        for (i=0;i<k+1;i++){
	            MultiSum[0][i] = 0;   
	        }
	        
	        for (i=1;i<n+1;i++){
	            for (j=1;j<k+1;j++){
	                if (N[i]>j)
	                    MultiSum[i][j] = MultiSum[i-1][j];
	                else MultiSum[i][j] = Math.max(N[i]+MultiSum[i][j-N[i]], MultiSum[i-1][j]);
	            }
	        }
	        
	        return MultiSum[n][k];
	    }

	    public static void main(String[] args) {
	        Scanner myScan = new Scanner(System.in);
	        int T = myScan.nextInt();
	        int N[] = new int[2001];
	        int i,n,k;
	        while(T-->0){
	            n = myScan.nextInt();
	            k = myScan.nextInt();
	            for (i=1;i<=n;i++)
	                N[i] = myScan.nextInt();
	            
	            //System.out.println(Arrays.toString(N));
	            
	            System.out.print(solution(N,k,n));
	            System.out.println();
	        }
	        myScan.close();
	    }
	}


