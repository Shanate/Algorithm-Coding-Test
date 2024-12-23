import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int testCaseCnt = Integer.parseInt(bf.readLine());

		String[] cardNumber = new String[testCaseCnt];
		char[][] splitStr = new char[testCaseCnt][];
		char[] tOrF = new char[testCaseCnt];

		int z = 0;
		//문자열을 쪼개서 char배열에 저장한다.
		while (z < testCaseCnt) {
			cardNumber[z] = bf.readLine();
			
			if(cardNumber[z].contains("-")) {
				cardNumber[z] = cardNumber[z].replaceAll("-", "");
			}
			
			splitStr[z] = cardNumber[z].toCharArray();
			z++;
		}
		
		for (int i = 0; i < testCaseCnt; i++) {
			int sum = 0;

			//카드번호의 오른쪽에서부터  index(15)부터 -1씩 감소하며 검사 
			for (int j = splitStr[i].length - 1 ; j >= 0; j--) {
				
				// char to int
				int charToInt = splitStr[i][j] - '0';

				// 오른쪽에서 부터 짝수 index를 만나면
				if (j % 2 == 0) {
					// 짝수항의 *2 값이 10보다 크다면 10의 자리, 1의 자리 쪼개서 더함
					if ((charToInt * 2) >= 10) {
						charToInt *= 2;
						sum +=  (charToInt / 10) + (charToInt) % 10;
					//10보다 작다면 그냥 2배 하여 더함 	
					} else
						sum += charToInt * 2;
				// 오른쪽에서 부터 홀수 index는 그냥 더함 
				} else
					sum += charToInt;
			}
			
			// 10으로 나눈 나머지가 0이라면 T저장 
			if (sum % 10 == 0)
				tOrF[i] = 'T';
			else
				tOrF[i] = 'F';
		}

		for (int i = 0; i < testCaseCnt; i++) {
			System.out.println(tOrF[i]);
		}
	}
}