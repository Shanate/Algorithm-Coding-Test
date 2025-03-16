import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		//A와 B가 음수 양수 일때 조건을 나누고 연산 출력
		if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == -1) {
			System.out.println((A.divide(B)).add(BigInteger.ONE));
			System.out.println((A.remainder(B)).subtract(B));
		}else if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == 1){
			System.out.println((A.divide(B)).subtract(BigInteger.ONE));
			System.out.println((A.remainder(B)).add(B));
		}else {
			System.out.println(A.divide(B));
			System.out.println(A.remainder(B));
		}
	}

}