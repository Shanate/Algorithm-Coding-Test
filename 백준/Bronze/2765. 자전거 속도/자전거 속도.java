import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//해당 케이스 수
		int i = 1;
		//테스트 케이스 수가 정해져있지 않기 때문에 무한루프 사용
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//지름, 회전수, 초 순서로 변수 선언
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			double C = Double.parseDouble(st.nextToken());
			//회전수가 0이 오면 반복문 종료한다.
			if(B == 0) {
				break;
			}
			//연산할때 사용할 초를 시간으로 바꿔준다. 3600을 나눠도 되고, 60으로 두번 나눠도 된다.
			C = (C / 60) / 60;
			//이동 거리를 밀리거리로 바꾸는 공식
			double distance = ((((A * 3.1415927) * B) / 12) / 5280);
			//MPH를 구하는 공식
			double MPH = (distance / C); 
			
			//print를 한줄만에 끝내도 되고 필자처럼 길어질거같아 여러개로 나눠서 출력문을 작성해도 된다.
			System.out.print("Trip #" + i + ": ");
			System.out.print(String.format("%.2f", distance) + " ");
			System.out.print(String.format("%.2f", MPH));
			//출력이 끝나고 다음 케이스 입력시에 줄바뀜을 준다.
			System.out.println();
			
			//반복이 넘어갈때마다 케이스 수에 1을 더한다.
			i++;
		}
	}

}