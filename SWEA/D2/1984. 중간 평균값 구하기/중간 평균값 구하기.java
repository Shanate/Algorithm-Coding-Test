import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {

	public static void main(String[] args) throws Exception {
	//	System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		int[] arr = new int[10];
		double sum = 0;
		for(int i=0; i<10; i++) {
			int number = sc.nextInt();
			arr[i] = number;
		}
		Arrays.sort(arr);
		for(int i=1; i<9; i++) {
			sum += arr[i];
		}
		System.out.println("#" + test_case + " " + Math.round(sum/8));
		}
	}
}