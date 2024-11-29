import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		//입력값을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//받은 입력값을 공백으로 구분해서 각각 a,b에 넣는다.
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int count = 0; //반복횟수를 체크하기 위한 변수
		int result = 0; //범위내 누적합을 구하기 위한 변수

		for(int i=1;i<=b;i++) { //i는 몇번까지 반복할까?에 필요하다. 숫자 b까지 반복해야 한다.
			for(int j=1;j<=i;j++) { //j는 i를 몇번 반복할까?에 필요하다. i번만큼 반복해야한다.
				count++;

				if(a<=count && count<=b) { //만약 반복횟수가 a와 b사이라면
					result += i; //그때의 데이터 i의 누적합을 구한다.
					//만약 i가 7이라고 가정하면, j는 1~7이 된다.
					//7이 7번 반복되기 때문에, j의 누적합이 아닌 i의 누적합을 구해야 한다.
				}
			}
		}

		System.out.println(result);

	}
}