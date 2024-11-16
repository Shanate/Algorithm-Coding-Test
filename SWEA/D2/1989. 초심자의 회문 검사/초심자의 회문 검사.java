import java.util.Scanner;
import java.io.FileInputStream;
class Solution {

	public static void main(String[] args) throws Exception {
//		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		


		for(int test_case = 1; test_case <= T; test_case++)
		{
		String str = sc.next(); // level // SAMSUNG // eye // hannah // B1A4
		  int result = 1;
	         for(int i=0; i<str.length()/2+1; i++) {
	             if(str.charAt(i) != str.charAt(str.length()-i-1)) { // 맨앞과 맨뒤 비교 부터 한칸씩 땡겨서
	                 result = 0; // 다르면 0
	                 break;
	             }
	         }
	         System.out.printf("#" + test_case + "% d\n",  result);
	     }
	 }
	}